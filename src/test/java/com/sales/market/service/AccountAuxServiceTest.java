package com.sales.market.service;

import com.sales.market.model.AccountAux;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

class AccountAuxServiceTest {
    @Autowired
    private AccountAuxService accountAuxService;

    AccountAux createBasicAccount() {
        System.out.println(this.accountAuxService);
        AccountAux accountAux = new AccountAux();
        accountAux.setTotalCredit(new BigDecimal("100"));
        accountAux.setBalance(new BigDecimal("100"));
        accountAux.setTotalDebit(BigDecimal.ZERO);
        AccountAux finalAccountAux = this.accountAuxService.save(accountAux);
        System.out.println(finalAccountAux.getId());
        return finalAccountAux;
    }

    @Test
    void givenBalance100WhenDebit100TwiceShouldFail() {
        AccountAux finalAccountAux = createBasicAccount();
        CompletableFuture<AccountAux> completableFutureFirstOperation =
                CompletableFuture.supplyAsync(() ->
                        accountAuxService.debit(
                                finalAccountAux.getId(),
                                new BigDecimal("100")
                        )
                ).orTimeout(60, TimeUnit.SECONDS);
        try {
            CompletableFuture<AccountAux> completableFutureSecondOperation =
                    CompletableFuture.supplyAsync(() ->
                            accountAuxService.debit(
                                    finalAccountAux.getId(),
                                    new BigDecimal("100")
                            )
                    ).orTimeout(60, TimeUnit.SECONDS);
        } catch (Exception executionException) {
            AccountAux accountAux2 = accountAuxService.getById(finalAccountAux.getId());
            System.out.println(accountAux2.getBalance());
            System.out.println(accountAux2.getTotalDebit());
            System.out.println(accountAux2.getTotalCredit());
        }

    }

    @Test
    void givenBalance100WhenDebit100TwiceShouldPass() {
        AccountAux finalAccountAux = createBasicAccount();

        CompletableFuture<AccountAux> completableFutureFirstOperation =
                CompletableFuture.supplyAsync(() ->
                        accountAuxService.debit(
                                finalAccountAux.getId(),
                                new BigDecimal("100")
                        )
                ).orTimeout(60, TimeUnit.SECONDS);
        CompletableFuture<AccountAux> completableFutureSecondOperation =
                completableFutureFirstOperation.thenApply(s -> accountAuxService.debit(
                                s.getId(),
                                new BigDecimal("100")
                        )
                ).orTimeout(60, TimeUnit.SECONDS);

        AccountAux accountAux2 = accountAuxService.getById(finalAccountAux.getId());
        assertEquals(0, accountAux2.getBalance());
    }
}
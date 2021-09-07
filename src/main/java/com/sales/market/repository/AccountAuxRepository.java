package com.sales.market.repository;

import com.sales.market.model.AccountAux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountAuxRepository extends JpaRepository<AccountAux, Long> {
}

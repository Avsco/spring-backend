package com.sales.market.service;

import com.sales.market.model.Buy;
import com.sales.market.repository.BuyRepository;
import org.springframework.stereotype.Service;

@Service
public class BuyService {
    private final BuyRepository buyRepository;

    public BuyService(BuyRepository buyRepository) {
        this.buyRepository = buyRepository;
    }

    public Buy save(Buy buy) {
        Buy savePersisted = this.buyRepository.save(buy);
        return savePersisted;
    }

    public Buy getById(Long id) {
        return buyRepository.getById(id);
    }
}

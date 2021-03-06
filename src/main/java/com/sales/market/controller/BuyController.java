/**
 * @author: Alan Benavides
 */

package com.sales.market.controller;

import com.sales.market.dto.BuyDto;
import com.sales.market.model.Buy;
import com.sales.market.service.BuyService;
import com.sales.market.service.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buys")
public class BuyController extends GenericController<Buy, BuyDto> {
    private BuyService service;

    public BuyController(BuyService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return this.service;
    }
}
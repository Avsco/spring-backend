/**
 * @author: Alan Benavides
 */

package com.sales.market.repository;

import com.sales.market.model.Buy;

import java.math.BigDecimal;

public interface BuyRepository extends GenericRepository<Buy> {
    public Buy findAllByValue(BigDecimal value);
}
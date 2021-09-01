package com.sales.market.dto;

import com.sales.market.model.Item;
import com.sales.market.model.ItemInstance;


public class ItemInstanceDto extends DtoBase<ItemInstance> {
    private Item item;
    private String identifier;
    private Boolean featured = Boolean.FALSE;
    private Double price;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }
}
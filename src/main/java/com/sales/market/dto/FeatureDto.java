package com.sales.market.dto;

import com.sales.market.model.Feature;

public class FeatureDto extends DtoBase<Feature> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
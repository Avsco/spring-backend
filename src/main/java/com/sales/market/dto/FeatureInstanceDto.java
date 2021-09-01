package com.sales.market.dto;

import com.sales.market.model.Feature;
import com.sales.market.model.FeatureInstance;


public class FeatureInstanceDto extends DtoBase<FeatureInstance> {
    private String value;
    private Feature feature;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }
}
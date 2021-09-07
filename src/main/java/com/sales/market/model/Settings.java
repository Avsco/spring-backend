/**
 * @author: Alan Benavides
 */

package com.sales.market.model;


import javax.persistence.Entity;

@Entity
public class Settings extends ModelBase {
    private String key;
    private String value;// promotionsActive = true
    private String classType; // java.lang.Boolean

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }
}
package com.sales.market.dto;

import com.sales.market.model.Employee;
import com.sales.market.model.Sale;

import java.util.Date;

public class SaleDto extends DtoBase<Sale> {
    private Employee employee;

    private Date date;

    private String description;
    private String image;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
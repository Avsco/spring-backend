package com.sales.market.dto;

import com.sales.market.model.Contract;
import com.sales.market.model.Employee;

import java.util.List;

public class EmployeeDto extends DtoBase<Employee> {
    private String firstName;
    private String lastName;
    private Byte[] image;

    List<Contract> contracts;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
}
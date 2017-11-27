package com.codecool.javaee.sample.controller;

import com.codecool.javaee.sample.ejb.CustomerService;
import com.codecool.javaee.sample.model.Customer;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class CustomerController {
    @Inject
    CustomerService customerService;
    private Customer customer = new Customer();

    public List<Customer> getAllCustomers() {
        return customerService.findAll();
    }

    public String addCustomer() {
        customerService.create(customer);
        return "customers";
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

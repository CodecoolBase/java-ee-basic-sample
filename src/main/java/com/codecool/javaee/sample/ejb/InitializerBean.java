package com.codecool.javaee.sample.ejb;

import com.codecool.javaee.sample.model.Customer;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class InitializerBean {

    @EJB
    CustomerService customerService;

    @PostConstruct
    public void init() {
        customerService.create(new Customer("Jack", "Smith"));
        customerService.create(new Customer("Adam", "Johnson"));
        customerService.create(new Customer("Kim", "Smith"));
        customerService.create(new Customer("David", "Williams"));
        customerService.create(new Customer("Peter", "Davis"));
    }
}

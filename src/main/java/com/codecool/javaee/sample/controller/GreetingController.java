package com.codecool.javaee.sample.controller;

import com.codecool.javaee.sample.model.Customer;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class GreetingController implements Serializable {
    private String actualName = "World";

    public String getName() {
        return actualName;
    }

    public void setName(String name) {
        actualName = name;
    }

}

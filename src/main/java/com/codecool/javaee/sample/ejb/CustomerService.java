package com.codecool.javaee.sample.ejb;

import com.codecool.javaee.sample.model.Customer;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CustomerService extends AbstractFacade<Customer> {
    @PersistenceContext(unitName = "samplePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerService() {
        super(Customer.class);
    }

}

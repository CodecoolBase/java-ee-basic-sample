package com.codecool.javaee.sample.api;

import com.codecool.javaee.sample.ejb.CustomerService;
import com.codecool.javaee.sample.model.Customer;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerServiceREST {

    @Inject
    CustomerService customerService;

    @GET
    public Response getAllCustomers() {
        return Response.ok(customerService.findAll()).build();
    }

    @GET
    @Path("{id}")
    public Response getCustomerById(@PathParam("id") Long id) {
        Customer customer = customerService.find(id);
        if (customer == null)
            throw new NotFoundException();
        return Response.ok(customer).build();
    }
}

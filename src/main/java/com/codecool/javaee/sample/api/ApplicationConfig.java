package com.codecool.javaee.sample.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("api")
public class ApplicationConfig extends Application {
    private final Set<Class<?>> classes;
    public ApplicationConfig() {
        HashSet<Class<?>> c = new HashSet<>();
        c.add(CustomerServiceREST.class);
        classes = Collections.unmodifiableSet(c);
    }
    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
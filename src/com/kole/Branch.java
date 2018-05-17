package com.kole;

import java.util.ArrayList;

public class Branch {
    private String name;
    ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addNewCustomer(String name, double initialAmount){
        Customer customer = new Customer(name,initialAmount);
        customers.add(customer);

    }
}

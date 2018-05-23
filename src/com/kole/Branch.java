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
        if (findCustomer(name) == null){
            customers.add(new Customer(name,initialAmount));
            System.out.println("Added customer with name " + name);
        } else System.out.println("Cannot add as customer " + name + "already exists");
    }

    public void addAdditionalTransactions(String name,double amount){
        Customer checkedCustomer = findCustomer(name);
        if (checkedCustomer == null){
            System.out.println("Cannot find customer. Aborting adding of additional transactions");
        } else checkedCustomer.addTransaction(amount);
    }

    private Customer findCustomer(String customerName){
        for (int i=0; i<customers.size();i++){
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        } return null;
    }
}
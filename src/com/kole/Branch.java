package com.kole;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addNewCustomer(String name, double initialTransaction){

        if (findCustomer(name)){
            System.out.println("Customer already present. Cannot add it");
        } else {
            customers.add(new Customer(name, initialTransaction));
            System.out.println("Added customer");
        }
    }

    public void addAddtionalTransactions(String name, double amount){
        if (returnCustomer(name)==null){
            System.out.println("Cannot add transaction as customer does not exist");
        } else {
            returnCustomer(name).addTransaction(amount);
        }
    }

    private boolean findCustomer(String name){
        for (int i=0; i<customers.size();i++){
            if (customers.get(i).getName().equals(name)){
                return true;
            }
        } return false;
    }

    public Customer returnCustomer(String name){
        for (int i=0; i<customers.size();i++){
            if (customers.get(i).getName().equals(name)){
                return customers.get(i);
            }
        } return null;
    }
}



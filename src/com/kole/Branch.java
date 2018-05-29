package com.kole;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public boolean addNewCustomer(String name, int initialTransaction){
        Customer tempCustomer = new Customer(name, initialTransaction);
        for (int i=0; i<customers.size(); i++){
            if (customers.get(i).getName().contains(name)){
                System.out.println("Customer already exists");
                return false;
            } else customers.add(tempCustomer);

        }return true;
    }

    public void addAddtionalTransactions(String name, int amount){
        
    }
}
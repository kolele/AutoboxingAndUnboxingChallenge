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
        for (int i=0; i<customers.size(); i++){
            if (customers.get(i).getName().contains(name)){
                System.out.println("Customer already exists");
                return false;
            } else customers.add(new Customer(name,initialTransaction));
            System.out.println("Added new customer with name " + customers.get(i).getName() + "with initial transaction of " + customers.get(i).getInitialTransaction());

        }return true;
    }

    public void addAddtionalTransactions(String name, int amount){

    }

    public Customer findCustomer(String name){
        for (int i=0; i<customers.size();i++){
            if (customers.get(i).getName().equals(name)){
                return customers.get(i);
            }
        } return null;
    }

    public void printBranchCustomers(){
        for (int i=0;i<customers.size();i++){
            System.out.println(customers.get(i).getName());
        }
    }
}
package com.kole;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }



    public void addNewCustomer(String name, int initialTransaction){

        if (findCustomer(name)){
            System.out.println("Customer already present. Cannot add it");
        } else {
            customers.add(new Customer(name, initialTransaction));
            System.out.println("Added customer");
        }
    }

    public void addAddtionalTransactions(String name, int amount){
        Customer tempCustomer = new Customer(name,amount);
        for (int i=0; i<customers.size(); i++){

        }
    }

    public boolean findCustomer(String name){
        for (int i=0; i<customers.size();i++){
            if (customers.get(i).getName().equals(name)){
                return true;
            }
        } return false;
    }

    public void printBranchCustomers(){
        for (int i=0; i<customers.size(); i++){
            System.out.println(customers.get(i).getName());
            System.out.println(customers.get(i).getTransactions());
        }
    }
}



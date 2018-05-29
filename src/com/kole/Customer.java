package com.kole;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double initialTransaction;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.initialTransaction = initialTransaction;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addCustomer(double initialTransaction){
        transactions.add(initialTransaction);
        //return new Customer(name,amount);

    }

    public void addTransaction(String name, double amount){
        
    }
}
package com.kole;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    private double initialTransaction;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.initialTransaction = initialTransaction;
        addInitialTransaction(this.initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public double getInitialTransaction() {
        return initialTransaction;
    }

    public void addInitialTransaction(double initialTransaction){
        this.transactions.add(initialTransaction);
    }
}
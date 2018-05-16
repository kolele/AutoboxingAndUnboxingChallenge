package com.kole;

import java.util.ArrayList;

public class Customer {
    private String name;
    private static ArrayList<Double> transactions;
    private int initialTransaction;

    public Customer(String name, ArrayList<Double> transactions, int initialTransaction) {
        this.name = name;
        this.transactions = transactions;
        this.initialTransaction = initialTransaction;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public int getInitialTransaction() {
        return initialTransaction;
    }

    public static void addInitialTransaction(double amount){
        transactions.add(amount);
        System.out.println("Added initial amount of " + amount);
    }
}
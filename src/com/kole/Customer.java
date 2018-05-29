package com.kole;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int initialTransaction;
    private ArrayList<Integer> transactions;

    public Customer(String name, int initialTransaction) {
        this.name = name;
        this.initialTransaction = initialTransaction;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
}
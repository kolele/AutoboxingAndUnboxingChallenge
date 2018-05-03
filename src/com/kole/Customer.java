package com.kole;

import java.util.ArrayList;

public class Customer {
    private String name;
    ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }
}

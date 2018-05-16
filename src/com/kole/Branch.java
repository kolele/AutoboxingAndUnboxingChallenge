package com.kole;

import java.util.ArrayList;

public class Branch {
    private String name;
    ArrayList<Customer>customers;

    public Branch(String name, ArrayList<Customer> customers, int initialTransaction) {
        this.name = name;
        this.customers = customers;
    }


}

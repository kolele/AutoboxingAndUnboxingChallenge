package com.kole;

import java.util.ArrayList;

public class Bank {
    String name;
    ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void addBranch(String name){
        Branch branch = new Branch(name);
        this.branches.add(branch);
    }

    public void addCustomer(Branch branch, String name, double initialAmount){

    }

    private void identifyBranch (String name){

    }

}

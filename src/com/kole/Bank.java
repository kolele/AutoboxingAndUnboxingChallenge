package com.kole;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBranch(String name) {
        if (returnBranch(name) != null) {
            System.out.println("Cannot add branch as branch already exists");
        } else branches.add(new Branch(name));
        System.out.println("Added " + name + " branch");

    }

    public void addBranchCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = returnBranch(branchName);
        if (returnBranch(branchName) == null) {
            System.out.println("Cannot add customer as branch " + branchName + " does not exist");
        } else {
            branch.addNewCustomer(name, initialTransaction);
        }
    }

    public void addTransaction(String branchName, String customerName, double initialTransaction){
        Branch branch = returnBranch(branchName);
        if (returnBranch(branchName) == null){
            System.out.println("This branch does not exist so cannot add additional transactions");
        } else {
            branch.addAddtionalTransactions(customerName,initialTransaction);
        }
    }

    public void printCustomers(String branchName, boolean transactions){
        Branch branch = returnBranch(branchName);
        if (returnBranch(branchName)== null){
            System.out.println("Branch does not exist");
        } else {
            for (int i=0; i< branches.size();i++){
                System.out.println();
            }
        }
    }


    public Branch returnBranch(String name) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(name)) {
                return branches.get(i);
            }
        }
        return null;
    }

}

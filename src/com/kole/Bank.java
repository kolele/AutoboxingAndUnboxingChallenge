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

    public boolean addBranch(String name){
        if (findBranch(name)==null){
            this.branches.add(new Branch(name));
            return true;
        } return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if (branch!=null){
            branch.addNewCustomer(customerName,initialAmount);
            return true;
        }return false;
    }



    private Branch findBranch(String name){
        for (int i=0;i<branches.size();i++){
            Branch checkedBranch = branches.get(i);
            if (checkedBranch.getName().equals(name)) {
                return checkedBranch;
            }
        } return null;
    }





}

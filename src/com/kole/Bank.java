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

    public void addBranch(String name){
        if (returnBranch(name)!=null){
            System.out.println("Cannot add branch as branch already exists");
        } else branches.add(new Branch(name));
        System.out.println("Added " + name + " branch");

    }

    public Branch returnBranch(String name){
        for (int i=0; i<branches.size();i++){
            if (branches.get(i).getName().equals(name)){
                return branches.get(i);
            }
        } return null;
    }

}

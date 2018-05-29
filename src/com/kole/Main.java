package com.kole;

public class Main {

    public static void main(String[] args) {
        Branch branch = new Branch("kobasa");
        //branch.addNewCustomer("Kole", 100);
        branch.addNewCustomer("lebac", 500);
        branch.addNewCustomer("Kole", 400);
        System.out.println(branch.findCustomer("Kole"));
        branch.addNewCustomer("Kole", 22);
    }
}

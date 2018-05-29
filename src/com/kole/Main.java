package com.kole;

public class Main {

    public static void main(String[] args) {
        Branch branch = new Branch("kobasa");
        branch.addNewCustomer("lebac", 500);
        branch.addNewCustomer("Kole", 400);
        branch.printBranchCustomers();
    }
}

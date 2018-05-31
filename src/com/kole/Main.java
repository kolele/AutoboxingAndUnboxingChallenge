package com.kole;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Raiffeisen");
        bank.addBranch("kobasa");
        bank.addBranchCustomer("kobasa", "kole", 212);
        bank.printCustomers("kobasa", false);


    }
}

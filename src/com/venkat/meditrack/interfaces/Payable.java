package com.venkat.meditrack.interfaces;

public interface Payable {

    double calculateTotal();

    default void printReceipt(double amount) {
        System.out.println("================================");
        System.out.println("Total Payable: ₹ " + amount);
        System.out.println("================================");
    }
}
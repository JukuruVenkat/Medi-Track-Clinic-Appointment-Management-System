package com.venkat.meditrack.entity;

import com.venkat.meditrack.interfaces.BillingStrategy;

public class Bill {

    private int billId;
    private double baseAmount;
    private BillingStrategy strategy;

    public Bill(int id, double baseAmount, BillingStrategy strategy) {
        this.billId = id;
        this.baseAmount = baseAmount;
        this.strategy = strategy;
    }

    public double calculateTotal() {
        return strategy.calculate(baseAmount);
    }

    public BillSummary generateSummary() {
        return new BillSummary(billId, calculateTotal());
    }
}
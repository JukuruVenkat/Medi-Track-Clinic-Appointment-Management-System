package com.venkat.meditrack.util;

import com.venkat.meditrack.interfaces.BillingStrategy;

public class DiscountBillingStrategy implements BillingStrategy {
    public double calculate(double baseAmount) {
        double discounted = baseAmount * 0.9;
        return discounted + discounted * 0.18;
    }
}
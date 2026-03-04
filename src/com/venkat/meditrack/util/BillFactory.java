package com.venkat.meditrack.util;

import com.venkat.meditrack.entity.Bill;

public class BillFactory {

    public static Bill createStandardBill(int id, double baseAmount) {
        return new Bill(id, baseAmount, new StandardBillingStrategy());
    }

    public static Bill createDiscountBill(int id, double baseAmount) {
        return new Bill(id, baseAmount, new DiscountBillingStrategy());
    }
}
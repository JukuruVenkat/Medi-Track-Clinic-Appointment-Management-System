package com.venkat.meditrack.util;

import com.venkat.meditrack.interfaces.BillingStrategy;
import com.venkat.meditrack.constants.Constants;

public class StandardBillingStrategy implements BillingStrategy {
    public double calculate(double baseAmount) {
        return baseAmount + baseAmount * Constants.TAX_RATE;
    }
}
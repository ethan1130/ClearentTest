package com.example.creditcardtest;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Discover implements CreditCard {
    BigDecimal amount;
    BigDecimal amountWithInterest;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getSimpleInterest() {
        return CalculateSimpleInterest.calculateAndFormatSimpleInterest(amount, Constants.discoverInterest);
    }

    public BigDecimal getAmountWithInterest() {
        return amountWithInterest;
    }

    @Override
    public void setAmountWithInterest(BigDecimal amountWithInterest) {

    }
}
//one person has one wallet one wallet contains several cards one credit card has different types of brands
//research array lists in java, also research how to use lists
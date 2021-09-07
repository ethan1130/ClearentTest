package com.example.creditcardtest;

import java.math.BigDecimal;

public class Visa implements CreditCard {
    BigDecimal amount;
    BigDecimal amountWithInterest;


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getSimpleInterest() {
        return CalculateSimpleInterest.calculateAndFormatSimpleInterest(amount, Constants.visaInterest);
    }

    public BigDecimal getAmountWithInterest() {
        return amountWithInterest;
    }

    public void setAmountWithInterest(BigDecimal amountWithInterest) {
        this.amountWithInterest = amountWithInterest;
    }
}

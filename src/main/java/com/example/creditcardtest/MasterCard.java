package com.example.creditcardtest;

import java.math.BigDecimal;

public class MasterCard implements CreditCard {
    BigDecimal amount;
    BigDecimal amountWithInterest;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getSimpleInterest() {
        return CalculateSimpleInterest.calculateAndFormatSimpleInterest(amount, Constants.mcInterest);
    }

    public BigDecimal getAmountWithInterest() {
        return amountWithInterest;
    }

    public void setAmountWithInterest(BigDecimal amountWithInterest) {
        this.amountWithInterest = amountWithInterest;
    }
}

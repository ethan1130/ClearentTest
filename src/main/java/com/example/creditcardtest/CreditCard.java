package com.example.creditcardtest;

import java.math.BigDecimal;

public interface CreditCard {
    BigDecimal getAmountWithInterest();
    void setAmountWithInterest(BigDecimal amountWithInterest);
    BigDecimal getAmount();
    BigDecimal getSimpleInterest();
    void setAmount(BigDecimal amount);
}

package com.example.creditcardtest;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculateSimpleInterest {
    public static BigDecimal calculateAndFormatSimpleInterest(BigDecimal amount, BigDecimal interest){
        BigDecimal simpleInterest;
        simpleInterest = amount.multiply(interest);
        return simpleInterest.setScale(2, RoundingMode.HALF_UP);
    }
}

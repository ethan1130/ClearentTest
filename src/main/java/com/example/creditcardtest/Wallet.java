package com.example.creditcardtest;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private final List<CreditCard> creditCards = new ArrayList<>();

    public Wallet() {
    }

    public  void getWallet() {

   }

   public List<CreditCard> getCredCards() {
        return this.creditCards;
   }

   public void setCreditCards(List<CreditCard> creditCardList) {
       this.creditCards.addAll(creditCardList);

   }

   public  int getNumberOfCards() {
       return this.creditCards.size();
   }

}

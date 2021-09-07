package com.example.creditcardtest;


import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    BigDecimal testCreditCardAmount = new BigDecimal("100.00");
    BigDecimal expectedSimpleInterestVisa = new BigDecimal("10.00");
    BigDecimal expectedSimpleInterestMasterCard = new BigDecimal("5.00");
    BigDecimal expectedSimpleInterestDiscover = new BigDecimal("1.00");

    @Test
    public void testCase1(){
        List<BigDecimal> simpleInterestList = new ArrayList<>();
        Person person = setDataForTestCase1();
        BigDecimal totalInterestForPerson = BigDecimal.ZERO;

        getSimpleInterestAndTotal(person, simpleInterestList, totalInterestForPerson);

        assertEquals(expectedSimpleInterestVisa, simpleInterestList.get(0));
        assertEquals(expectedSimpleInterestMasterCard, simpleInterestList.get(1));
        assertEquals(expectedSimpleInterestDiscover, simpleInterestList.get(2));


    }

    private Person setDataForTestCase1() {
        Person person = new Person();
        Wallet wallet = new Wallet();
        List<CreditCard> creditCardList = new ArrayList<>();
        CreditCard visaCard = new Visa();
        CreditCard masterCard = new MasterCard();
        CreditCard discoverCard = new Discover();
        List<Wallet> wallets = new ArrayList<>();

        visaCard.setAmount(testCreditCardAmount);
        masterCard.setAmount(testCreditCardAmount);
        discoverCard.setAmount(testCreditCardAmount);

        creditCardList.add(visaCard);
        creditCardList.add(masterCard);
        creditCardList.add(discoverCard);
        wallet.setCreditCards(creditCardList);
        wallets.add(wallet);
        person.setWallets(wallets);
        return person;
    }

    @Test
    public void testCase2(){
        Person person = setDataForTestCase2();
        List<BigDecimal> simpleInterestList = new ArrayList<>();
        BigDecimal totalInterestForPerson = BigDecimal.ZERO;

        getSimpleInterestAndTotal(person, simpleInterestList, totalInterestForPerson);

        assertEquals(expectedSimpleInterestVisa, simpleInterestList.get(0));
        assertEquals(expectedSimpleInterestDiscover, simpleInterestList.get(1));
        assertEquals(expectedSimpleInterestMasterCard, simpleInterestList.get(2));

    }

    private void getSimpleInterestAndTotal(Person person, List<BigDecimal> simpleInterestList, BigDecimal totalInterestForPerson) {
        for (Wallet wallet : person.getWallet()) {
            for (CreditCard creditCard : wallet.getCredCards()) {
                simpleInterestList.add(creditCard.getSimpleInterest());
                totalInterestForPerson = totalInterestForPerson.add(creditCard.getSimpleInterest());
            }
        }
    }

    private Person setDataForTestCase2() {
        Person person = new Person();
        Wallet wallet = new Wallet();
        Wallet wallet2 = new Wallet();
        List<CreditCard> creditCardList = new ArrayList<>();
        List<CreditCard> creditCardList2 = new ArrayList<>();
        CreditCard visaCard = new Visa();
        CreditCard masterCard = new MasterCard();
        CreditCard discoverCard = new Discover();
        List<Wallet> wallets = new ArrayList<>();

        visaCard.setAmount(testCreditCardAmount);
        discoverCard.setAmount(testCreditCardAmount);
        creditCardList.add(visaCard);
        creditCardList.add(discoverCard);

        wallet.setCreditCards(creditCardList);
        wallets.add(wallet);

        masterCard.setAmount(testCreditCardAmount);
        creditCardList2.add(masterCard);
        wallet2.setCreditCards(creditCardList2);
        wallets.add(wallet2);
        person.setWallets(wallets);
        return person;
    }

    @Test
    public void testCase3(){
        List<BigDecimal> simpleInterestList = new ArrayList<>();
        Person person = setDataForTestCase3Person1();
        BigDecimal totalInterestForPerson = BigDecimal.ZERO;

        getSimpleInterestAndTotal(person, simpleInterestList, totalInterestForPerson);
        assertEquals(expectedSimpleInterestMasterCard, simpleInterestList.get(0));

        List<BigDecimal> simpleInterestList2 = new ArrayList<>();
        Person person2 = setDataForTestCase3Person2();
        BigDecimal totalInterestForPerson2 = BigDecimal.ZERO;

        getSimpleInterestAndTotal(person2, simpleInterestList2, totalInterestForPerson2);

    }

    private Person setDataForTestCase3Person1() {
        Person person = new Person();
        Wallet wallet = new Wallet();
        List<CreditCard> creditCardList = new ArrayList<>();
        CreditCard visaCard = new Visa();
        CreditCard masterCard = new MasterCard();
        List<Wallet> wallets = new ArrayList<>();

        visaCard.setAmount(testCreditCardAmount);
        masterCard.setAmount(testCreditCardAmount);

        creditCardList.add(masterCard);
        creditCardList.add(visaCard);
        wallet.setCreditCards(creditCardList);
        wallets.add(wallet);
        person.setWallets(wallets);
        return person;
    }

    private Person setDataForTestCase3Person2() {
        Person person = new Person();
        Wallet wallet = new Wallet();
        List<CreditCard> creditCardList = new ArrayList<>();
        CreditCard visaCard = new Visa();
        CreditCard masterCard = new MasterCard();
        List<Wallet> wallets = new ArrayList<>();

        visaCard.setAmount(testCreditCardAmount);
        masterCard.setAmount(testCreditCardAmount);

        creditCardList.add(visaCard);
        creditCardList.add(masterCard);
        wallet.setCreditCards(creditCardList);
        wallets.add(wallet);
        person.setWallets(wallets);
        return person;
    }
//2 people have 1 wallet each,  person 1 has 1 wallet , with 2 cards MC and visa
// person 2 has 1 wallet – 1 visa and 1 MC -
// each card has $100 balance - calculate the total interest(simple interest) for each person and interest per wallet?
}


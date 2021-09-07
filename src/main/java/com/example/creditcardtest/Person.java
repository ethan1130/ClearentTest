package com.example.creditcardtest;

import java.util.ArrayList;
import java.util.List;

public class Person {
    protected List<Wallet> wallets = new ArrayList<>();

    public List<Wallet> getWallet() {
        return wallets;
    }

    public void setWallets(List<Wallet> walletList) {
        this.wallets.addAll(walletList);

    }
}

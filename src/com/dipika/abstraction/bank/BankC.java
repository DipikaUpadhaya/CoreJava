package com.dipika.abstraction.bank;

public class BankC extends Bank{
    private int balance;

    public BankC(int balance) {
        this.balance = balance;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}

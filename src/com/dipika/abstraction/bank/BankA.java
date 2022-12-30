package com.dipika.abstraction.bank;

public class BankA extends Bank{
    private int balance;

    public BankA(int balance) {
        this.balance = balance;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}

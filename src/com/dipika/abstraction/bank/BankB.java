package com.dipika.abstraction.bank;

public class BankB extends Bank{
    private int balance;

    public BankB(int balance) {
        this.balance = balance;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}

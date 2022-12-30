package com.dipika.abstraction.bank;

public class MainProgram {
    public static void main(String[] args) {
        BankA a= new BankA(100);
        BankB b= new BankB(150);
        BankC c= new BankC(200);
        System.out.println("Bank A is deposited by $"+a.getBalance());
        System.out.println("Bank B is deposited by $"+b.getBalance());
        System.out.println("Bank C is deposited by $"+c.getBalance());
    }
}

package com.dipika.loop.whileloop;

import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {
        int number;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of which you want to calculate the factorial value: ");
        number= scanner.nextInt();
        int i=1;
        int factorial=1;
        while(i<=number){
             factorial= factorial*i; //if we replace i with number we can do number--)
            i++;
        }
        System.out.println(factorial);
    }
}

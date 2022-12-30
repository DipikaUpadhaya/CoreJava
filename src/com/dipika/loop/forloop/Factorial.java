package com.dipika.loop.forloop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int number;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number to calculate factorial value: ");
        number= scanner.nextInt();

        int i;
        int factorial=1;
        for(i=1; i<=number; i++){
            factorial=factorial*i;
        }
        System.out.println("The Factorial value of "+number +" is "+ factorial);
    }
}

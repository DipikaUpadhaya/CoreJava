package com.dipika.basic;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int number;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the number: ");
        number= scanner.nextInt();
        if(number%2==0){
            System.out.println("The given number is even ");
        }else{
            System.out.println("The given number is odd ");
        }

    }
}

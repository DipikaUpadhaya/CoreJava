package com.dipika.conditional;

import java.util.Scanner;

public class EqualInteger {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first integer number: ");
        num1= scanner.nextInt();
        System.out.println("Enter second integer number: ");
        num2= scanner.nextInt();
        if(num1==num2){
            System.out.println("Given two integers are equal");
        }else{
            System.out.println("Given two integers are not equal");
        }

    }
}

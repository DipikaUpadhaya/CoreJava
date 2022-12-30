package com.dipika.basic;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1= scanner.nextInt();
        System.out.println("Enter the second number: ");
        num2= scanner.nextInt();
        System.out.println("Enter the third number: ");
        num3= scanner.nextInt();

        System.out.println("The average of given numbers are : "+ ((num1+num2+num3)/3));
    }
}

package com.dipika.loop.whileloop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int number, rem,  sum=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number: ");
        number= scanner.nextInt();
        int temp=number;
        while(temp!=0 ){
            rem=temp%10;
            sum= sum+rem;
            temp=temp/10;
        }
        System.out.println("The sum of digits of given number "+ number+" is "+ sum);




    }
}

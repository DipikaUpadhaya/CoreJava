package com.dipika.loop.dowhileloop;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int num1, num2;
        int sum=0;
        char choice='y';
        Scanner scanner= new Scanner(System.in);

        do{
            System.out.println("Enter first number: ");
            num1= scanner.nextInt();
            System.out.println("Enter second number: ");
            num2=scanner.nextInt();
            sum= sum+num1+num2;

            System.out.println("Do you want to perform that operator again(y/n)?");
            choice=scanner.next().charAt(0);
        }while(choice=='y' || choice=='Y');
        System.out.println("total sum: "+sum);
    }
}

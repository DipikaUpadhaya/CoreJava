package com.dipika.functions;

import java.util.Scanner;

public class MainPogram {
    public static void main(String[] args) {
        FunctionBank functionBank= new FunctionBank();
        functionBank.display();

        //getTotal method called
        int total=functionBank.getTotal(4,5);
        System.out.println("the total sum of to integer is: "+ total);

        //getProduct method called
        int num1, num2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1=scanner.nextInt();
        System.out.println("Enter second number: ");
        num2= scanner.nextInt();
        int product= functionBank.getProduct(num1, num2);
        System.out.println("The product of two numbers entered by user is: "+ product);

        //areaOfCircle Method called
        functionBank.areaOfCircle(2.5f);

        //isEligibleToVote method called
        boolean isEligible= functionBank.isEligibleToVote(20);
        if(isEligible){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote.");
        }

        //getFactorial method called
        int fact= functionBank.getFactorial(5);
        System.out.println("The factorial of given number is: "+fact);

        //averageNumber method called
        functionBank.averageNumber(56, 76, 21);

        //sumOfNumber method called
        int sum= functionBank.sumOfNumber(10,20,30);
        System.out.println("The sum of given three number : "+sum);

        //isEven method called
        boolean isEven= functionBank.isEven(88);
        if(isEven){
            System.out.println("The number is even.");
        }else{
            System.out.println("The number is odd");
        }

        //displayRange method called
        functionBank.displayRange(10,20);


    }
}

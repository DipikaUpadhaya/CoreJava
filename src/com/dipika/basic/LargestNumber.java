package com.dipika.basic;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter first number : ");
        num1= scanner.nextInt();
        System.out.println("Please enter second number : ");
        num2= scanner.nextInt();
        System.out.println("Please enter third number : ");
        num3= scanner.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("First number " +num1 +" is Largest among three numbers");
        }else if(num2>num1 && num2>num3){
            System.out.println("Second number " +num2 +" is Largest among three numbers");
        }else{
            System.out.println("Third number " +num3 +" is Largest among three numbers");
        }
    }
}

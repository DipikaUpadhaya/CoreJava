package com.dipika.conditional;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number: ");
        number= scanner.nextInt();
        if(number> 0){
            System.out.println("given number is positive");
        }else if(number==0){
            System.out.println("given number is zero");
        }else{
            System.out.println("Given number is negative");
        }
    }
}

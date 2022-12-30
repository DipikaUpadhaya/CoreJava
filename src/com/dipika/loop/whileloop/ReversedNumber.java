package com.dipika.loop.whileloop;

import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number: ");
        number= scanner.nextInt();

         int reverse=0;
         int rem;
         while(number!=0){
             rem=number%10;
             reverse= reverse*10 +rem;
             number=number/10;
         }
        System.out.println("The reversed number of given number  "+" is "+reverse);


    }
}

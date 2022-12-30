package com.dipika.loop.whileloop;

import java.util.Scanner;

public class PallindromNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number: ");
        number= scanner.nextInt();

        int temp=number;
        int rem, reverse=0;
        while(temp!=0){
            rem= temp%10;
            reverse= reverse*10 +rem;
            temp=temp/10;
        }
        if(reverse==number){
            System.out.println("The given number is pallindrome.");
        }else{
            System.out.println("The given number is not pallindrome.");
        }

    }
}

package com.dipika.loop.whileloop;

import java.util.Scanner;

public class LargestDigitInNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number: ");
        number= scanner.nextInt();

        int temp=number;
        int smallest=100;
        int rem, largest=0;
        while(temp!=0){
            rem= temp%10;
            if(rem>largest){
                largest=rem;
            }else if(rem<smallest){
                smallest= rem;
            }
            temp=temp/10;
        }
        System.out.println("The largest digit of given number "+ number + " is "+ largest);
        System.out.println("The smallest digit of given number "+ number + " is "+ smallest);
    }
}

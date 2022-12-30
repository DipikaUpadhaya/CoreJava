package com.dipika.loop.whileloop;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        int min, max;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the minimum number: ");
        min= scanner.nextInt();
        System.out.println("Enter the maximum number: ");
        max= scanner.nextInt();
        
        int evenSum = 0, oddSum=0;
        int i=min;
        while( i<=max){
            if(i%2==0){
                evenSum=evenSum+i;
            }else{
                oddSum=oddSum+i;
            }
            i++;
        }
        System.out.println("The sum of even numbers are: "+evenSum);
        System.out.println("The sum of odd numbers are: "+oddSum);
        
    }
}

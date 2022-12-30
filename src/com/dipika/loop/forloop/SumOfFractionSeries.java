package com.dipika.loop.forloop;

import java.util.Scanner;

public class SumOfFractionSeries {
    public static void main(String[] args) {
        int n;
        float sum=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the number n upto which you want to calculate sum: ");
        n= scanner.nextInt();
        while(n<0){
            System.out.println("Please enter the positive integer: ");
            n= scanner.nextInt();
        }
        for(float i=1; i<=n; i++){
            sum=sum+ (1/i);
        }
        System.out.println("The sum is "+ sum);
    }
}

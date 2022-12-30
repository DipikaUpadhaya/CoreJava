package com.dipika.loop.forloop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int i ;
        int sum = 0;

        for( i=1; i<=10; i++){
            sum= sum+i;
        }
        System.out.println("The sum of first natural number is: "+ sum);

        // to print sum of natural number  between minimum and maximum number;
        int min, max;
        int sumOfNumber=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minimum number: ");
        min= scanner.nextInt();
        System.out.println("Enter maximum number: ");
        max= scanner.nextInt();
        for(int j= min; j<=max; j++){
            sumOfNumber= sumOfNumber+ j;
        }
        System.out.println("The total sum of numbers between minimum number " +
                " and maximum number is: "+ sumOfNumber);
    }

}

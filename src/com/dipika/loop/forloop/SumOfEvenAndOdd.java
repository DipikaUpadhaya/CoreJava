package com.dipika.loop.forloop;

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        int min, max;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the minimum number: ");
        min= scanner.nextInt();
        System.out.println("Enter the maximum number: ");
        max= scanner.nextInt();

        int evenSum=0, oddSum=0;
        for(int i=min; i<=max; i++){
            if(i%2==0){
                evenSum=evenSum +i;
            }else{
                oddSum=oddSum+i;
            }
        }
        System.out.println("The sum of even numbers between "+min+" and "+max+" is "+evenSum);
        System.out.println("The sum of odd numbers between "+min+" and "+max+" is "+oddSum);
    }
}

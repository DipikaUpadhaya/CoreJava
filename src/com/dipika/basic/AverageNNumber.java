package com.dipika.basic;

import java.util.Scanner;

public class AverageNNumber {
    public static void main(String[] args) {
        int totalNum;

        Scanner scanner= new Scanner(System.in);
        System.out.println("How many numbers do you wan to average: ");
        totalNum= scanner.nextInt();
        int[] numberArray = new int[totalNum];
        while(totalNum>0){
            System.out.println("Enter the numbers to calculate average: ");
            numberArray[totalNum-1]= scanner.nextInt();
            totalNum--;
        }
        int sum=0;
        for(int i=0; i<numberArray.length; i++){
            sum= sum+numberArray[i];
        }
        System.out.println("the average is :"+ sum/numberArray.length);
    }
}

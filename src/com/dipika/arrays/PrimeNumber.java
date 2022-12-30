package com.dipika.arrays;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array.");
        size= scanner.nextInt();
        int[] numberArray= new int[size];
        System.out.println("Enter the numbers inside the array");
        for(int i=0; i<numberArray.length; i++){
            numberArray[i]= scanner.nextInt();
        }

    }

}

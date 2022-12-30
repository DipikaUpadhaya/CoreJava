package com.dipika.arrays;

import java.util.Scanner;

public class SumOfElementsOfArray {
    public static void main(String[] args) {
        int size;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        size=scanner.nextInt();

        double[] marks= new double[size];
        double sum=0, avg=0;
        System.out.println("Enter the marks in array, marks: ");
        for(int i=0; i<size; i++){
            marks[i]=scanner.nextDouble();
            sum= sum+marks[i];
            avg=sum/size;
        }
        System.out.println("The total sum of all elements of array are: "+sum);
        System.out.println("The avaerage  is: "+ avg);

    }
    public static int sumNumber(int [] numArray){
        int sum=0;
        for(int i=0; i<numArray.length; i++){
            sum=sum+numArray[i];
        }
        return sum;
    }
}

package com.dipika.arrays;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int size;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter  the size of an array: ");
        size= scanner.nextInt();

        int[] data= new int[size];
        int largest= Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        System.out.println("Enter elements of array, data: ");
        for(int i=0; i<size; i++){
            data[i]= scanner.nextInt();
            if(largest<data[i]){
                largest=data[i];
            }else if(smallest>data[i]){
                smallest=data[i];
            }
        }
        System.out.println("the largest element of given array is: "+largest);
        System.out.println("the smallest element of given array is:  "+smallest);

    }

    public static int largestNumber(int[] numArray){
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<numArray.length; i++){
            if(largest<numArray[i]){
                largest=numArray[i];
            }
        }
        return largest;
    }
    public int smallestNumber(int[] numArray){
        int smallest= Integer.MAX_VALUE;
        for(int i=0; i<numArray.length; i++){
            if(smallest>numArray[i]){
                smallest=numArray[i];
            }
        }
        return smallest;
    }
}

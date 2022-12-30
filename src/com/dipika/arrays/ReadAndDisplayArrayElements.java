package com.dipika.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadAndDisplayArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArrays = new int[10];

        //for reading integer elements
        System.out.println("Enter the elements in array, intArrays: ");
        for (int i = 0; i < 10; i++) {
            intArrays[i] = scanner.nextInt();
        }
        // for displaying integer elements
         //System.out.println("The elements are: " + Arrays.toString(intArrays));
        for (int i = 0; i < 10; i++) {
           System.out.print(intArrays[i]+ " ");
        }
        System.out.println();


        int size;
        System.out.println("Enter the size of an array, names: ");
        size= scanner.nextInt();
        String [] names= new String[size];

        // to read data from user
        System.out.println("Enter names inside array : ");
        for(int i=0; i<size; i++){
            names[i]= scanner.nextLine();
        }
        System.out.println(" The elements of array names are: ");
        for (int i=0; i<size; i++){
            System.out.println(names[i]);
        }
    }
}

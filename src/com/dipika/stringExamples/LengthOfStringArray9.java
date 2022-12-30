package com.dipika.stringExamples;

//Write a program to take an array of strings and display the length of strings in an array.

import java.util.Arrays;

public class LengthOfStringArray9 {
    public static void main(String[] args) {
        String[] strings = {"Dipika", "Ramesh", "Deepesh", "Deepa","Ram", "EkNarayan"};
        int[] length = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            length[i] = strings[i].length();
        }
        System.out.println("The length of strings in an stringsArray is:");
        for(int i=0; i< length.length; i++){
            System.out.print(length[i]+" ");
        }
        // to print in using arrays.to string method
        System.out.println(Arrays.toString(length));
    }
}

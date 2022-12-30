package com.dipika.stringExamples;

//Write a program to take a string input and sort it alphabetically.

import java.util.Arrays;
import java.util.Scanner;

public class SortAlphabetically11 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String str= scanner.nextLine();

        char[] chars= str.toCharArray();
        Arrays.sort(chars);
        System.out.print("The alphabetically sorted string is: ");
        for(int i=0; i<str.length(); i++){
            System.out.print(chars[i]);
        }
    }
}

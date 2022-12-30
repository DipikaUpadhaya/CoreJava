package com.dipika.stringExamples;

//Write a program to find the number of white spaces used in a string.

import java.util.Scanner;

public class CountOfWhiteSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                count = count + 1;
            }
        }
        System.out.println("The numbers of white space in given string is: " + count);
    }
}

package com.dipika.stringExamples;

//Write a program to take a string input and display its length and last character.

import java.util.Scanner;

public class LengthOfString1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string as input: ");
        String str= scanner.nextLine();
        System.out.println("The length of given string is: "+str.length());
        System.out.println("The last character of string is: "+str.charAt(str.length()-1));
    }
}

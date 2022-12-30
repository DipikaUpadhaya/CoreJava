package com.dipika.stringExamples;

//Write a program that takes the string input and reverse the string and display it.

import java.util.Scanner;

public class ReverseString4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str= scanner.nextLine();

        System.out.println("The reverse of given string, "+str+" is: ");
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }

    }
}

package com.dipika.stringExamples;

//Write a program to find the special characters in the string. Special characters includes !@#$
//
//%^&*()”:>? sur$$$tttt@#$%

import java.util.Locale;
import java.util.Scanner;

public class SpecialCharacter {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str= scanner.nextLine();

        String str2= str.toUpperCase();

        for(int i=0; i<str.length(); i++){
            char ch= str2.charAt(i);
            if(!((ch>=65 && ch<=90) || ( ch>=48 && ch<=57) || ch==32)){
                System.out.print(ch);
            }
        }


    }
}

package com.dipika.stringExamples;

import java.util.Scanner;

//Write a program to take two string as input and check whether they are equal or not (Try
//both equals and ignore case)
public class EqualString {
    public static void main(String[] args) {
        String str1, str2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first string: ");
        str1= scanner.nextLine();
        System.out.println("Enter second string: ");
        str2= scanner.nextLine();

        boolean isEqual= str1.equals(str2);
        System.out.println("Does both string are equal? "+isEqual);

        isEqual=str1.equalsIgnoreCase(str2);
        System.out.println("Are both string equal? "+isEqual);
    }
}

package com.dipika.stringExamples;

//Write a program to find the number of uppercase and lower case characters in a string.

import java.util.Scanner;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str= scanner.nextLine();
       // char[] upperArray= new char[str.length()];

        int lowercaseCount=0, uppercaseCount=0;
        for(int i=0; i<str.length(); i++){
            char c= str.charAt(i);
            if(c>=65 && c<=90){
              //  upperArray[uppercaseCount]=c;
                uppercaseCount=uppercaseCount+1;
            }if(c>=97 && c<=122){
                lowercaseCount=lowercaseCount+1;
            }
        }
        System.out.println("The number of uppercase character in a given string is : "+uppercaseCount);
        System.out.println("The number of lowercase character in a given string is : "+lowercaseCount);

       /*for(int i=0; i<upperArray.length; i++)
        System.out.print(upperArray[i]);*/


    }
}

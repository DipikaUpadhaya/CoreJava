package com.dipika.stringExamples;

//Write a program to take string input and convert it to uppercase and lowercase with out
//using the String function. [ USE ASCII Concept ]

import java.util.Scanner;

public class UpperLowerAscii {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str= scanner.nextLine();

        String lowerString="";// upperString="";
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch>=65 && ch<=90){
                char ls= (char) (ch+32);
                lowerString=lowerString+ls;
            } else if (ch >= 97 && ch <= 122) {
                char us= (char) (ch-32);
                //upperString=upperString+us;
                lowerString=lowerString+us;
            }
        }
        System.out.println(lowerString);
       // System.out.println(upperString);
    }
}

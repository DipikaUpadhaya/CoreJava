package com.dipika.stringExamples;

//Write a program that takes a string input and find distinct characters in string and keep it in
//array.

import java.util.Scanner;

public class DistinctCharacterInArray3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str= scanner.nextLine();
        char[] charArray= str.toCharArray();

        String temp="";
        for(int i=0; i<str.length(); i++){
            if(temp.indexOf(charArray[i])<0){
                String comp = String.valueOf(charArray[i]);
                if(!temp.contains(comp))
                    temp=temp +charArray[i];
            }
        }
        System.out.println(temp);
    }
}

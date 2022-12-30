package com.dipika.stringExamples;

//Write a Java program to create a new string after removing a specified
// character from a given string except the first and last position.

public class RemoveCharacter20 {
    public static void main(String[] args) {
        String str="Ramesh";
        String str1="";
        char removeChar='m';

        for(int i=1; i<str.length()-1; i++){
            char ch= str.charAt(i);
            if(ch!=removeChar){
                str1=str1+ch;
            }
        }
       str1=str.charAt(0)+str1+str.charAt(str.length()-1);
        System.out.println("New string is: "+str1);
    }
}

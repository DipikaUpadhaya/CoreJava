package com.dipika.stringExamples;

import java.util.Locale;

public class StringManipulation51_60 {
    public static void main(String[] args) {
        StringManipulation51_60 sm= new StringManipulation51_60();
        sm.charArray("Dipika Upadhaya");
        //52.
        System.out.println(sm.lowercase("DipIKA, UpadHaya"));
        //53.
        System.out.println(sm.uppercase("dipika, UpaDhaya"));
        //54.
        System.out.println(sm.trimWhitespace(" I am dipika  "));


    }

    //51.Write a Java program to create a character array containing the contents of a string.
    public void charArray(String str) {
        char[] chars = str.toCharArray();
        System.out.println(chars);
    }
    //52.Write a Java program to convert all the characters in a string to lowercase.
    public String lowercase(String str){
        return str.toLowerCase();
    }
    //53.Write a Java program to convert all the characters in a string to uppercase.
    public String uppercase(String str){
        return str.toUpperCase();
    }
    //54.Write a Java program to trim any leading or trailing whitespace from a given string.
    public String trimWhitespace(String str){
        return str.trim();
    }
    //55.Write a Java program to find the longest Palindromic Substring within a string
    public String longestPallindromSubString(String str){


        return str;

    }
    //56.Write a Java program to find all interleavings (subsets) of given strings.
}

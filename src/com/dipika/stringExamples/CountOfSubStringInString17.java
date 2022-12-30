package com.dipika.stringExamples;

//Write a Java program to count how many times the substring 'life' is present anywhere in a given string.
// Counting can also happen for the substring 'li?e', any character instead of 'f'.

public class CountOfSubStringInString17 {
    public static void main(String[] args) {
        String str="Li e your own life, dont listen to others like";
        String firstTwo="li";
        String last="e";
        int count=0;
        for(int i=0; i<str.length()-3; i++){
            if((firstTwo.compareToIgnoreCase(str.substring(i, i+2))==0 &&
                    (last.compareToIgnoreCase(str.substring(i+3, i+4)))==0)){
                count++;
            }
        }
        System.out.println("The count of life/Li?e in given string is: "+count);
    }
}

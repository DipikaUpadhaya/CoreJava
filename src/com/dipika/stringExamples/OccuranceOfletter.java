package com.dipika.stringExamples;

//Write a program to find the first and the last occurence of
// the letter 'o' and character ',' in "Hello, World”.

public class OccuranceOfletter {
    public static void main(String[] args) {
        String str="Hello, World.";
        System.out.println("The first occurance of letter o is at index "+str.indexOf('o',0));
        System.out.println("The last occurance of letter o is at index "+str.lastIndexOf('o'));

    }
}

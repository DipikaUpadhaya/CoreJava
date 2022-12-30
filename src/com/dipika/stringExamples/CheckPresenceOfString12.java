package com.dipika.stringExamples;

//Write a program to check if the word 'orange' is present in the "This is orange juice"

public class CheckPresenceOfString12 {
    public static void main(String[] args) {
        String str="This is orange juice.";
        String str1="orange";

        System.out.println("Does "+"\""+str1+"\""+" is present in "+"\""+str+"\""+"?");
        System.out.println(str.contains(str1));

        //Write a program to check if the letter 'e' is present in the word 'Umbrella'.
        String string="Umbrella";
        System.out.println("Does letter 'e' is present in word 'Umbrella ? "+string.contains("e"));

    }
}

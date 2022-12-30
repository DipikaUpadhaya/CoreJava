package com.dipika.stringExamples;

//Write a program to replace all consonants from the string
// "Hello, have a good day" with your favourite character.

public class ReplaceConsonant15 {
    public static void main(String[] args) {
        String str="Hello, have a good day";
        char fav= '@';
        String temp="";


        str=str.toUpperCase();
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(!(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')){
                str.replace(ch, fav);
                temp=temp+fav;
            }else{
                temp=temp+ch;
            }
        }
        System.out.println(temp);
    }
}

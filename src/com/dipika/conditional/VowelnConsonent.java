package com.dipika.conditional;

import java.util.Scanner;

public class VowelnConsonent {
    public static void main(String[] args) {
        char ch;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a character from a keyboard: ");
        ch= scanner.next().charAt(0);
        if(ch== 'a' || ch== 'e' || ch== 'i'|| ch=='o' || ch=='u'){
            System.out.println("Given input character is vowel");
        }else{
            System.out.println("Given input character is consonant");
        }

    }
}

package com.dipika.loop.whileloop;

import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {
        String name;
        boolean isPallindrome= true;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the name of string to check pallindrome or not: ");
        name= scanner.next();

        int left=0, right= name.length()-1;
       // System.out.println(name.length());
        while(left<right){
            if(name.charAt(left)!= name.charAt(right)){
               isPallindrome = false;
               break;
            }
            left++;
            right--;
        }
        if(isPallindrome){
            System.out.println("The given string is pallindrome string .");
        }else{
            System.out.println("The given string is not pallindrome string.");
        }



    }
}

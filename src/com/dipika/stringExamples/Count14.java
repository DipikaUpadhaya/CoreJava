package com.dipika.stringExamples;

//Write a program to find the number of vowels, consonants, digits
// and white space characters in a string.

import java.util.Scanner;

public class Count14 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String str= scanner.nextLine();
      //  findVowels(str);
        findConsonants(str);
       // findNumbers(str);


    }
    public static void findVowels(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u'){
                count=count+1;
            }
        }
        System.out.println("The number of vowels present in string is: "+count);
    }
    public static void findConsonants(String str){
        int vowelCount=0;
        int consonantCount=0;
        int numberCount=0;
        str=str.toUpperCase();
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
                vowelCount=vowelCount+1;
            }else if (ch>='A'&& ch<='Z'){
                consonantCount=consonantCount+1;
            }else if(ch>='0' && ch<='9'){
                numberCount++;
            }
        }
        System.out.println("The number of vowels present in string is: "+vowelCount);
        System.out.println("The number of consonants present in string is: "+consonantCount);
        System.out.println("The number of digits present in string is: "+numberCount);
    }

    public static void findNumbers(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch>=48 && ch<=57){
                count++;
            }
        }
        System.out.println("The count of numbers present in string is: "+count);

    }

}

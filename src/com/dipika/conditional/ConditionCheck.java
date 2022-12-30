package com.dipika.conditional;

import java.util.Scanner;

public class ConditionCheck {
    public static void main(String[] args) {
        int number;
        String input;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number: ");
        number= scanner.nextInt();
        System.out.println("Enter the string input: ");
        input=scanner.next();

        String str1=input.substring(0,1);
        //int  subNumber= Integer.parseInt(String.valueOf(number).substring(0, 1));
        String s= Integer.toString(number);
        int subNumber=Integer.parseInt(s.substring(0,1));

        // number divisible by 2
       /* if(number%2==0){
        }
        //length of string between 5 to 10
        if(input.length()>=5 && input.length()<= 10){
        }
        //The string’s first letter should start from ‘a’ or ‘b’ or ‘s’ or ‘p’ regardless of case.
        // It may be upper or lower case
        if(str1.equalsIgnoreCase("a") || str1.equalsIgnoreCase("b") ||
                str1.equalsIgnoreCase("s") ||str1.equalsIgnoreCase("p")){
        }
        //The string should not contain any of given characters ‘x’ or ’y’ or’ z’
        if(!input.contains("x") || !input.contains("y") || !input.contains("z")){
        }
        //The number should be between 2 and 4 digits
        if((String.valueOf(number).length()>=2 ) && (String.valueOf(number).length()<=4 )){
        }
        //The number should always starts with odd digits
        if(subNumber%2 !=0){
        }*/

        if((number%2==0) && ((input.length()>=5) &&(input.length()<=10)) &&
                (str1.equalsIgnoreCase("a") || str1.equalsIgnoreCase("b") ||
                str1.equalsIgnoreCase("s") ||str1.equalsIgnoreCase("p")) &&
                (!input.contains("x") && !input.contains("y") && !input.contains("z")) &&
                ((String.valueOf(number).length()>=2 ) && (String.valueOf(number).length()<=4 )) &&
                (subNumber%2 !=0)
        ){
            System.out.println(" Eureka ");

        }else{
            System.out.println("Conditions do not match");
        }
    }
}

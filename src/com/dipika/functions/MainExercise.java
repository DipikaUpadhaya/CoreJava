package com.dipika.functions;

import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        FunctionExercise functionExercise= new FunctionExercise();

        //11.oddNumbers in range method called
        functionExercise.oddNumbersInRange(9, 29);
        System.out.println();

        //12. checkPrime method called
        boolean isPrime= functionExercise.checkPrime(8);
        if(isPrime){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }

        //13. primeNumbers method called
        functionExercise.primeNumbers(1, 1000);

        //14.printMultiplication method called
        System.out.println();
        functionExercise.printMultiplication(9);

        //15. lengthofNumber method called
        int len=functionExercise.lengthOfNumber(3245671);
        System.out.println("The length of given number is: "+len);

        //16. countOfWords method called
        int count= functionExercise.countWords("I want to be a perfect software enginner.");
        System.out.println("The count of all words of a string is "+ count);

        //17. isSameNum method called
        boolean isSame=functionExercise.isSameNum(43, 431);
        System.out.println("Are both parameters same? "+isSame);

        //18. maximumNumber method called
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1= scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2= scanner.nextInt();
        System.out.println("Enter third number: ");
        int num3= scanner.nextInt();
        int max= functionExercise.maximumNumber(num1,num2, num3);
        System.out.println("The maximum number among three number entered by user is: "+max);

        //19. sumOfNumber method called
        int sum= functionExercise.sumOfNumber(num1,num2, num3);
        System.out.println("The sum of three numbers entered by user is: "+ sum);

        //20. gradeOfStudents method called
        functionExercise.gradeOfStudents(78);

        //21. to check pallindrome
        int number;
        System.out.println("Enter the number to check pallindrome.");
        number= scanner.nextInt();
        while(number<0){
            System.out.println("Please enter the non negative integer number");
            number=scanner.nextInt();
        }
       boolean isPallindrome= functionExercise.isPallindrome(number);
       if(isPallindrome){
           System.out.println("The given number is pallindrome.");
           //System.out.println(isPallindrome);
       }else{
           System.out.println("The given number is not pallindrome.");
           //System.out.println(isPallindrome);
       }

       //22. isVowel method called
        System.out.println("Enter the name of string to count vowel letters from it");
        String name= scanner.next();
        char[] charArray=name.toCharArray();
        int countOfVowel=0;
        for(int i=0; i<charArray.length; i++){
            boolean isVowel= functionExercise.isVowel(charArray[i]);
            if(isVowel){
                countOfVowel=countOfVowel+1;
            }
        }
        System.out.println("The total count of vowel in given string is: "+countOfVowel);

        //23. containVowel method called
       boolean containVowel= functionExercise.containVowel("rthmndg");
        System.out.println("Do given string contain vowel ? "+containVowel);

        //24. factorialRecursion method called
        int fact=functionExercise.factorialRecursion(6);
        System.out.println("The factorial of given number is: "+fact);

        //25.gcdRecursion method called
        int gcd= functionExercise.gcdRecursion(14,26);
        System.out.println("The gcd of two number is "+gcd);

        //29. isLeapYear method called
        boolean isleap= functionExercise.isLeapYear(2020);
        System.out.println("Does given year is leap year? "+isleap);

    }
}

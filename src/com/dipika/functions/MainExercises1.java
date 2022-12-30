package com.dipika.functions;

import java.util.Date;

public class MainExercises1 {
    public static void main(String[] args) {
        FunctionExercises1 exercises1= new FunctionExercises1();
        //31. areaOfTriangle method called
        exercises1.areaOfTriangle(10, 15,  20);

        //32. dateAndTime method called
        exercises1.dateAndTime(new Date());

        //34. swapNumber method called
        exercises1.swapNumber(14, 17);

        //30 isPasswordValid method call
       // System.out.println("Is password valid: " + exercises1.isPasswordValid("AZ0912uasdt"));

        //35. sumOfSeries method called
        exercises1.sumOfSeries(5);

        //36. isArmstrong method called
        boolean isArmstrong= exercises1.isArmStrong(407);
        System.out.println("Does the number is armstrong? "+ isArmstrong);

        boolean isPerfectNumber= exercises1.isPerfect(28);
        System.out.println("Does the given number is perfect? "+isPerfectNumber);

        //38. isAnagramString method called
        char[] str1={'s', 'p','e','a'};
        char[] str2={'p','e','a','s'};
        boolean isAnagram= exercises1.isAnagram( str1, str2);
        System.out.println("Does given two string are anagram? "+isAnagram);



    }
}

package com.dipika.conditional;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        float mark1, mark2, mark3, mark4, mark5, totalScore;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks in first subject: ");
        mark1 = scanner.nextFloat();
        System.out.println("Enter your marks in second subject: ");
        mark2 = scanner.nextFloat();
        System.out.println("Enter your marks in third subject: ");
        mark3 = scanner.nextFloat();
        System.out.println("Enter your marks in fourth subject: ");
        mark4 = scanner.nextFloat();
        System.out.println("Enter your marks in fifth subject: ");
        mark5 = scanner.nextFloat();
/*        if ((mark1 < 0 || mark1 > 100) || (mark2 < 0 || mark2 > 100) || (mark3 < 0 || mark3 > 100)
                || (mark4 < 0 || mark4 > 100) || (mark5 < 0 || mark5 > 100)) {
            System.out.println("Invalid mark : Please enter marks between 0 to 100");
            return;
        }*/
        if (isValidMark(mark1) || isValidMark(mark2) || isValidMark(mark3)
                || isValidMark(mark4) || isValidMark(mark5)) {
            System.out.println("Invalid mark : Please enter marks between 0 to 100");
            return;
        }
        totalScore = mark1 + mark2 + mark3 + mark4 + mark5;

        if (totalScore >= 0 && totalScore < 200) {
            System.out.println("Your total score is : " + totalScore + " and Your grade is C");
        } else if (totalScore >= 200 && totalScore < 350) {
            System.out.println("Your total score is : " + totalScore + " and Your grade is B");
        } else {
            System.out.println("Your total score is : " + totalScore + " and Your grade is A");
        }


    }
    public static boolean isValidMark(float mark){
        return (mark < 0 || mark > 100);
    }
}

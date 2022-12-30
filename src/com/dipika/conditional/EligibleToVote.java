package com.dipika.conditional;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        int age;
        boolean hasCitizenship;
        boolean hasVoterCard;
         Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your age: ");
        age= scanner.nextInt();
        System.out.println("Do you have citizenship: ");
        hasCitizenship= scanner.nextBoolean();
        System.out.println("Do you have voter card: ");
        hasVoterCard= scanner.nextBoolean();

        if(age>=18 && (hasCitizenship || hasVoterCard)){
            System.out.println("You are eligible to vote ");
        }else {
            System.out.println("You are not eligible to vote ");
        }
    }
}

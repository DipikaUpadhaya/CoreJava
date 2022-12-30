package com.dipika.loop.dowhileloop;

import java.util.Scanner;

public class ProgramUntilExit {
    public static void main(String[] args) {
        int number, count=0;
        String choice="exit";
        Scanner scanner= new Scanner(System.in);
        do{
            System.out.println("Enter the number: ");
            number= scanner.nextInt();
            count=count+1;
            System.out.println("Do you want to continue(y/n)?");
            choice= scanner.next();
        }while(!choice.equalsIgnoreCase("exit"));
        System.out.println("The total numbers of input given by user is: "+ count);
    }
}

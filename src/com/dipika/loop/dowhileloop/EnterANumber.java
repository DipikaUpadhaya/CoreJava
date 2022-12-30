package com.dipika.loop.dowhileloop;

import java.util.Scanner;

public class EnterANumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner= new Scanner(System.in);

        do{
            System.out.println("Enter the number: ");
            number=scanner.nextInt();
        }while(number!=0);
    }
}

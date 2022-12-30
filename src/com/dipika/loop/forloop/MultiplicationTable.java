package com.dipika.loop.forloop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of which you want to calculate the mulltiplication table: ");
        number= scanner.nextInt();
        if(number>0) {
            System.out.println("Multiplication table of "+number +" is ");
            for (int i = 1; i <= 10; i++) {

                System.out.println(number + " * " + i + " = " + number * i);

            }
        }else{
                System.out.println("Please enter  a positive integer number: ");
            }
        }
    }


package com.dipika.loop.whileloop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the number to calculate multiplication table: ");
        num= scanner.nextInt();
        while(num<=0){
            System.out.println("Please enter positive integer: ");
            num=scanner.nextInt();
        }
        int i = 1;
        while(i<=10){
            System.out.println(num + " * " + i + " = " + num * i);
            i++;
        }
        
    }
}

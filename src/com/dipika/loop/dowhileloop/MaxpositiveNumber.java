package com.dipika.loop.dowhileloop;

import java.util.Scanner;

public class MaxpositiveNumber {
    public static void main(String[] args) {
        int number, max=0;
        Scanner scanner= new Scanner(System.in);
        do{
            System.out.println("Enter the number: ");
            number= scanner.nextInt();
            if(number>max){
                max=number;
            }
        }while(number!=0);
        System.out.println("The maximum number you entered is : "+ max);
    }
}

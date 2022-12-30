package com.dipika.loop.forloop;

import java.util.Scanner;

public class RaisedToThePower {
    public static void main(String[] args) {
        int baseNumber,powerNumber;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the base number: ");
        baseNumber=scanner.nextInt();
        System.out.println("Enter the power number: ");
        powerNumber= scanner.nextInt();

        int result=1;
        for(int i=1; i<=powerNumber; i++){
            result= result*baseNumber;
        }
        System.out.println("The result of "+baseNumber + " ^ "+ powerNumber +" is "+ result);
    }
}

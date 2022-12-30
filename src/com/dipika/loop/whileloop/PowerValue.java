package com.dipika.loop.whileloop;

import java.util.Scanner;

public class PowerValue {
    public static void main(String[] args) {
        int base, power;
        int i = 1, result=1;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter base number: ");
        base= scanner.nextInt();
        System.out.println("Enter power number: ");
        power= scanner.nextInt();
        while(i<=power){
            result= result*base;
            i++;
        }
        System.out.println("The result is: "+ result);
    }
   
    
}

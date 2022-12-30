package com.dipika.loop.forloop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number: ");
        number= scanner.nextInt();
        while(number<0){
            System.out.println("Please enter the positive integer: ");
            number= scanner.nextInt();
        }
        if(number==0 || number==1){
            System.out.println(number +"is not prime number");
        }else{
            for(int i=2; i<number/2; i++){
                if(number%i==0){
                    System.out.println(number + "Is not prime number.");
                    return;
                }
            }
            System.out.println(number +" is prime number.");
        }


        }

    }


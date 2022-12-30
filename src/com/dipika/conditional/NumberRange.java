package com.dipika.conditional;

import java.util.Scanner;

public class NumberRange {
    public static void main(String[] args) {
        int fromNumber, toNumber;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter fromNumber: ");
        fromNumber=scanner.nextInt();
        System.out.println("Enter toNumber: ");
        toNumber= scanner.nextInt();
        if(fromNumber>=0 &&toNumber>=0){
            if(fromNumber < toNumber){
                for(int i=fromNumber; i<toNumber; i++){
                    System.out.println(i);
                }
            }else if(fromNumber > toNumber){
                int temp=fromNumber;
                toNumber=fromNumber;
                fromNumber=temp;
                System.out.println("from"+ fromNumber);
              for(int i=fromNumber; i<toNumber; i++){
                  System.out.println(i);
              }
            }

        }else{
            System.out.println("Please enter number that is greater than 0.");
        }

    }
}

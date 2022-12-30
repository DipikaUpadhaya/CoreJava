package com.dipika.loop.whileloop;

import java.util.Scanner;

public class CountOfPositiveNumber {
    public static void main(String[] args) {
        int number, count=0;
        Scanner scanner= new Scanner(System.in);
       // number= scanner.nextInt();
        while(true){
            System.out.println("Enter the number: ");
            number= scanner.nextInt();
            if(number>0){
                count=count+1;
            }else{
                break;
            }

        }
        System.out.println("The count of positive number entered by user is "+ count);
    }

}

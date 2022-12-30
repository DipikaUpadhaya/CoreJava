package com.dipika.loop.dowhileloop;

import java.util.Scanner;

public class DisplayMenu {
    public static void main(String[] args) {
        int choice=0;
        int count=0;
        Scanner scanner= new Scanner(System.in);
        do{
            System.out.println("1. Continue.");
            System.out.println("2. Exit.");
            if(choice==1){
                count++;
            }
            choice= scanner.nextInt();
        }while(choice==1);
        System.out.println("The count of choice 1 is "+ count);
    }

}

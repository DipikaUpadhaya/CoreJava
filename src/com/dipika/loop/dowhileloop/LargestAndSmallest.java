package com.dipika.loop.dowhileloop;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int number;
        int largest=0, smallest=0;
        char choice='y';
        Scanner scanner= new Scanner(System.in);
        do{
            System.out.println("Enter the number: ");
            number=scanner.nextInt();
            if(number< smallest){
                smallest=number;
            }else if(number>largest){
                largest=number;
            }
            System.out.println("Do you want to enter the number again(Y/N)? ");
            choice=scanner.next().charAt(0);
        }while(choice=='y'||choice=='Y');
        System.out.println("The smallest number is "+ smallest);
        System.out.println("The largest number is "+ largest);
    }
}

package com.dipika.loop.dowhileloop;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        int numbers;
        int positiveCount=0, negativeCount=0, zeroCount=0;
        char choice='y';
        Scanner scanner= new Scanner(System.in);

        do{
            System.out.println("Enter the numbers");
            numbers=scanner.nextInt();
            if(numbers>0){
                positiveCount=positiveCount+1;
            }else if(numbers<0){
                negativeCount=negativeCount+1;
            }else{
                zeroCount=zeroCount+1;
            }
            System.out.println("Do you want to enter number again(Y/N)?");
            choice=scanner.next().charAt(0);
        }while(choice=='y'|| choice=='Y');
        System.out.println("Number of positive integer are: "+positiveCount);
        System.out.println("Number of negative integer are: "+negativeCount);
        System.out.println("Number of zero integer are: "+zeroCount);
    }

}

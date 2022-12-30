package com.dipika.loop.whileloop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
       /* int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        number= scanner.nextInt();
        while(number<0){
            System.out.println("please enter positive number: ");
            number= scanner.nextInt();
        }
        if(number==0 ||number==1){
            System.out.println("Is not prime number");
        }else{
            int i=2;
            while(i<number){
                if(number%i==0){
                    System.out.println("Not Prime");
                  return;
                }
                i++;
            }
            System.out.println("Is prime");
        }*/

        int fromNum, toNum;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number from Number: ");
        fromNum= scanner.nextInt();
        System.out.println("Enter the number to number: ");
        toNum= scanner.nextInt();

        int count=0;
        System.out.println("The prime numbers between "+fromNum+" and "+toNum+" are: ");
        for(int i=fromNum; i<toNum; i++){
            for(int j=2; j<i; j++){
                if(i%j==0){
                   count=0;
                   break;
                }else{
                    count=1;
                }
            }
            if(count==1){
                System.out.print(i + " ");
            }
        }

    }
}

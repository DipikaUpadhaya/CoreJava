package com.dipika.loop.forloop;

import java.util.Scanner;

public class ArmstrongNumberInRange {
    public static void main(String[] args) {
        /*int count=0;
        System.out.print("The armstrong numbers between 1 and 500 are:  ");
        for ( int i=2; i<500; i++){
            int temp=i;
            int result =0;
            while(i!=0){
                int cube=1;
                 int rem= i%10;
                 for(int j=1; j<=3; j++){
                     cube=cube*rem;
                 }
                 result=result+cube;
                 i=i/10;

            }
            if(result==temp){
                System.out.println(result);
                count++;
            }
        }
        System.out.println("Total armstrong numbers: " + count);*/
        int tempNum, count =0;
        for(int num =1;num<500;num++){
            tempNum = num;
            int result=0;
            while(tempNum!=0){
                int rem=tempNum%10;
                int cube=1;
                for(int i=1; i<=3; i++){
                    cube=cube*rem;
                }
                result=result+cube;
                tempNum=tempNum/10;
            }
            if(result==num){
                count++;
                System.out.println("The given number  is Armstrong number " + num);
            }
        }
        System.out.println("There are total " + count + " Armstrong number from 1 to 500" );
    }
}

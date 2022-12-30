package com.dipika.loop.whileloop;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number;
        int result=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number to check weather it is armstrong or not: ");
        number= scanner.nextInt();
        int storeNum = number;
        while(number!=0){
            int rem=number%10;
            int cube=1;
            for(int i=1; i<=3; i++){
                cube=cube*rem;
            }
            result=result+cube;
            number=number/10;
        }
        if(result==storeNum){
            System.out.println("The given number  is Armstrong number");
        }else{
            System.out.println("The given number  is not Armstrong number");
        }
    }
}

package com.dipika.loop.whileloop;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int num1, num2, hcf=0, lcm=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1= scanner.nextInt();
        System.out.println("Enter second number: ");
        num2=scanner.nextInt();
        int i=1;
        while(i<=num1 || i<=num2){
            if(num1%i==0 && num2%i==0){
                hcf=i;
                lcm=(num1*num2)/hcf;
            }
            i++;
        }
        System.out.println("HCF is: "+hcf);
        System.out.println("LCM is: "+lcm);

    }
}

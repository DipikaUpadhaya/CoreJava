package com.dipika.conditional;

import java.util.Scanner;

public class AngleTriangle {
    public static void main(String[] args) {
        int angle1, angle2, angle3;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first angle : ");
        angle1= scanner.nextInt();
        System.out.println("Enter second angle : ");
        angle2= scanner.nextInt();
        System.out.println("Enter third angle : ");
        angle3= scanner.nextInt();
        if(angle1 + angle2 + angle3 == 180){
            System.out.println("The Triangle is valid" );
        }else{
            System.out.println("The Triangle is not valid");
        }
    }
}

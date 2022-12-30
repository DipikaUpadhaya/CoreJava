package com.dipika.basic;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        float sideA;
        float sideB;
        float sideC;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the length of First side");
        sideA= scanner.nextFloat();
        System.out.println("Enter the length of Second side");
        sideB= scanner.nextFloat();
        System.out.println("Enter the length of Third side");
        sideC= scanner.nextFloat();
        if (sideA == sideB && sideA == sideC){
            System.out.println("the given triangle is equilateral triangle");
        }else{
            System.out.println("The triangle is not equilateral triangle");
        }

    }
}

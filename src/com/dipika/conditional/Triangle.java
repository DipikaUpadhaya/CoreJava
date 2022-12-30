package com.dipika.conditional;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        float side1, side2, side3;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first side of triangle: ");
        side1= scanner.nextFloat();
        System.out.println("Enter second side of triangle: ");
        side2= scanner.nextFloat();
        System.out.println("Enter third side of triangle: ");
        side3= scanner.nextFloat();
        if(side1== side2 && side1== side3){
            System.out.println("The given triangle is equilateral triangle. ");
        }else if(side1 == side2 || side2 == side3 || side1== side3){
            System.out.println("The given triangle is isosceles triangle. ");
        }else{
            System.out.println("The given triangle is scalene triangle");
        }
    }
}

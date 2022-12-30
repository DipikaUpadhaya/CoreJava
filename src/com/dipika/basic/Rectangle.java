package com.dipika.basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float length, breadth;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter length of rectangle: ");
        length= scanner.nextFloat();
        System.out.println("Please enter the breadth of rectangle: ");
        breadth= scanner.nextFloat();

        System.out.println("The area of rectangle is "+ length*breadth);
        System.out.println("The perimeter of rectangle is "+ 2*(length+breadth));
    }
}

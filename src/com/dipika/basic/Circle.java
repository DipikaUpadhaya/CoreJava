package com.dipika.basic;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        //final float PI= 3.14f;
        float radius;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the radius of circle: ");
        radius= scanner.nextFloat();

        System.out.println("The area of circle is : "+ Math.PI*radius*radius);
        System.out.println("The perimeter of circle is : "+ 2*Math.PI*radius);
    }
}

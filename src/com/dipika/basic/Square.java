package com.dipika.basic;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        float length;
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter the length of square: ");
        length= scanner.nextFloat();
        System.out.println("The perimeter of square is "+ 4*length);
        System.out.println("The area of square is :  "+ length*length);
    }
}

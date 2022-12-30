package com.dipika.conditional;

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your height in feet");
        height= scanner.nextFloat();
        System.out.println("Your height in centimeter is : "+ 30.48*height);

    }
}

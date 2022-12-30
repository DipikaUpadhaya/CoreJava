package com.dipika.loop.nestedloopforpattern;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        int row, col;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows for solid rectangle pattern.");
        row= scanner.nextInt();
        System.out.println("Enter the column for solid rectangle pattern");
        col= scanner.nextInt();
        //outer loop
        for(int i=0; i<row; i++){
            //iner loop
            for(int j=0; j<col; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

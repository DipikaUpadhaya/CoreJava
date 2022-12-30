package com.dipika.conditional;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        float x, y;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter  first co-ordinate x: ");
        x= scanner.nextFloat();
        System.out.println("Enter  second co-ordinate y: ");
        y= scanner.nextFloat();
        if( x>=0 && y>=0){
            System.out.println("this co-ordinate lies in first Quadrant Q1");
        }else if(x<0 && y>0){
            System.out.println("this co-ordinate lies in second Quadrant Q2");
        }else if(x>0 && y<0){
            System.out.println("this co-ordinate lies in fourth Quadrant Q4");
        }else{
            System.out.println("this co-ordinate lies in Third Quadrant Q3");
        }
    }
}

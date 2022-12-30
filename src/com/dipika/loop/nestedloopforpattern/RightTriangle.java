package com.dipika.loop.nestedloopforpattern;

public class RightTriangle {
    public static void main(String[] args) {
        //outerloop
        for(int i=1; i<=5; i++){
           //inner loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}

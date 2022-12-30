package com.dipika.loop.nestedloopforpattern;

public class LeftTriangle {
    public static void main(String[] args) {
        //     *
        //    **
        //   ***
        //  ****
        // *****


        //outer loop
        for(int i=0; i<5; i++){
            //loop for printing space
            for(int j=0; j<(5-i); j++){
                System.out.print(" ");
            }
            //inner loop
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }



    }
}

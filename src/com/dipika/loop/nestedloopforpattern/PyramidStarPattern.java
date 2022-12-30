package com.dipika.loop.nestedloopforpattern;

public class PyramidStarPattern {
    public static void main(String[] args) {
        //    *
        //    * *
        //   * * *
        //  * * * *
        // * * * * *
        //* * * * * *

        for(int i=1; i<7; i++){
            //for space
            for(int j= 7-i; j>1; j--){
                System.out.print(" ");
            }
            //for column
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

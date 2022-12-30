package com.dipika.loop.nestedloopforpattern;

public class DiamondPattern {
    public static void main(String[] args) {
        // *
        //   * *
        //  * * *
        // * * * *
        //* * * * *
        // * * * *
        //  * * *
        //   * *
        //    *


        for(int i=1; i<=5; i++) {
            //space
            for (int j = 5 - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
            //for lower half
            for (int k =4; k>=1; k--) {
                //for inner space
                for(int l=k; l<=4; l++){
                    System.out.print(" ");
                }
                for(int l=k; l>=1; l--){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }

        }
    }


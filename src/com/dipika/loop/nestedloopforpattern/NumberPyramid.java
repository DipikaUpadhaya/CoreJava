package com.dipika.loop.nestedloopforpattern;

public class NumberPyramid {
    public static void main(String[] args) {
        //    1
        //   2  2
        //  3  3  3
        // 4  4  4  4
        //5  5  5  5  5

        int number=1;
        for(int i=1; i<=5; i++){
            //for space
            for(int j=5-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(number+"  ");

            }
            number++;
            System.out.println();
        }
    }
}

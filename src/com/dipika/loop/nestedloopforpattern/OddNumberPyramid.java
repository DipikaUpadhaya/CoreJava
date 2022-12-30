package com.dipika.loop.nestedloopforpattern;

public class OddNumberPyramid {
    public static void main(String[] args) {
        //   1
        //  222
        // 33333
        int space = 5, tonum =1;
        for(int i = 1; i<=5; i++){
            for(int spc = space;spc>=1; spc--)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=tonum; j++){
                System.out.print(i);
            }
            tonum=tonum+2;
            space--;
            System.out.println();
        }
    }


}

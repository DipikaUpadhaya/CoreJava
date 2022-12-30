package com.dipika.loop.nestedloopforpattern;

public class PalindromeNumber {
    public static void main(String[] args) {
        //    1
        //   212
        //  32123
        // 4321234
        //543212345
        int space=5;
        for(int i = 1; i <=5;i++){
            for(int spc =space; spc>0;spc--){
                System.out.print(" ");
            }
            for(int j = i;j >=1;j--){
                System.out.print(j);
            }
            for (int k = 2; k<=i;k++){
                System.out.print( k);
            }
            space--;
            System.out.println();
        }
    }
}

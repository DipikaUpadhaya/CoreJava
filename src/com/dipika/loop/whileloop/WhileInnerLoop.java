package com.dipika.loop.whileloop;

import java.util.Scanner;

public class WhileInnerLoop {
    public static void main(String[] args) {
        int i=1, j=2;
        while(i==1){

            while(j==2){
                System.out.println("Hello  this is while inner loop");
                j--;
            }
            i++;
        }
    }
}

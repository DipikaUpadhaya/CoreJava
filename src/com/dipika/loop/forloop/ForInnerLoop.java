package com.dipika.loop.forloop;

public class ForInnerLoop {
    public static void main(String[] args) {
        for(int i=0; i<3; i++){
            for(int j=1;  j<=i; j++){
                System.out.println("Hello this is for inner loop");
            }
        }
    }
}

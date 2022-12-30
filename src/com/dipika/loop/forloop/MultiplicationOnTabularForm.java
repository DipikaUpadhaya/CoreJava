package com.dipika.loop.forloop;

public class MultiplicationOnTabularForm {
    public static void main(String[] args) {

        for(int i=1; i<=10; i++){
            for(int j=1; j<=5; j++){
                System.out.print(j +" * "+ i+ " = "+ i*j+ "     ");
            }
            System.out.println();
        }
    }

}

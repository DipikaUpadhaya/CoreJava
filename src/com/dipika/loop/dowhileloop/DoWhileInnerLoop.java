package com.dipika.loop.dowhileloop;

public class DoWhileInnerLoop {
    public static void main(String[] args) {
        int i=1;
        do{
            //System.out.println("This is do while outer loop");
            int j=1;
            do {
                System.out.println("This is do while inner loop");
                j++;
            }while(i==j);
            i++;
        }while(i<3);
    }
}

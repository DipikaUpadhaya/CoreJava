package com.dipika.conditional;

import java.util.Scanner;

public class AsciiIncrement {
    public static void main(String[] args) {
        String input;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter input from keyboard: ");
        input=scanner.next();

        for(int i=0; i<input.length(); i++){
            int ascii= input.charAt(i);
            if((ascii>=65 && ascii<=90) ||(ascii>=97 && ascii<=122)){
                ascii+=1;
                System.out.print((char)ascii);
            }else {
                System.out.print((char)ascii);
            }

        }




    }
}

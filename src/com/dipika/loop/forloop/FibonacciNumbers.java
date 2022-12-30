package com.dipika.loop.forloop;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int n;
        int n0=0, n1=1, n2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the n terms to which you want to calculate fibonacci series: ");
        n=scanner.nextInt();

        System.out.println(n0 );
        System.out.println(n1);
        for(int i=2; i<n; i++){
            n2= n0+n1;
            System.out.println(" "+n2);
            n0=n1;
            n1=n2;
        }

    }
}

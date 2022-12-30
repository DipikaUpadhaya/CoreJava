package com.dipika.loop.forloop;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        int n, m;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of terms n : ");
        n= scanner.nextInt();
        System.out.println("Enter the number of which you want to calculate series, m: ");
        m= scanner.nextInt();
        int ser = m;
        int sum=0;
        for(int i=1; i<=n; i++){
            System.out.print(ser + " + ");
            sum=sum+ser;
            ser = ser*10+m;
        }
        System.out.println("");
        System.out.println("Sum of seris = " + sum);

    }

}

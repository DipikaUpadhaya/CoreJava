package com.dipika.loop.whileloop;

public class SumOfNumbers {
    public static void main(String[] args) {
        int i = 1, sum=0;
        while(i<=10){
            sum=sum+i;
            i++;
        }
        System.out.println("The sum of first natural number is : "+ sum);
    }
}

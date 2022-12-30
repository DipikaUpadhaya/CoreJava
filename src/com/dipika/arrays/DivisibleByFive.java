package com.dipika.arrays;

public class DivisibleByFive {
    public static void divisibleFive(int[] numArray){
        for(int i=0; i<numArray.length; i++){
            if(numArray[i]%5==0){
                System.out.println(numArray[i]);
            }
        }
    }
}

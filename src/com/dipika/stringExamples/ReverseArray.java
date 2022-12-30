package com.dipika.stringExamples;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String[] originalArray={"Dipika", "TEXAS", "Ramesh", "Dipa","Dipesh"};
        System.out.println("The original array is: "+ Arrays.toString(originalArray));

        String[] reverseArray= new String[originalArray.length];
        int index= originalArray.length-1;
        for(int i=0; i< originalArray.length; i++){
            reverseArray[i]= originalArray[index--];
        }
        System.out.println("The reversed array is: "+ Arrays.toString(reverseArray));
    }
}

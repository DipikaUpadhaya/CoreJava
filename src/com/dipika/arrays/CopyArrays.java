package com.dipika.arrays;

public class CopyArrays {
    public static int [] negativeArray(int[] numArray){
        int [] negArray= new int[numArray.length];
        int j=0;
        for(int i=0; i<numArray.length; i++){
            if(numArray[i]<0){
                negArray[j]=numArray[i];
                j++;
            }
        }
        return negArray;
    }

    public static int[] positiveArray(int [] numArray){
        int [] posArray= new int[numArray.length];
        int j=0;
        for(int i= 0; i<numArray.length; i++){
            if(numArray[i]>0){
                posArray[j]=numArray[i];
                j++;
            }
        }
        return  posArray;
    }
}

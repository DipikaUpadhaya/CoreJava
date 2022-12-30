package com.dipika.stringExamples;

//Write the program to take an array of string input and
// sort the array according to length of string both ascending and descending.

public class SortStringArray10 {
    public static void main(String[] args) {
        String[] stringArray= {"Ram","Dipika", "Dipa", "Ramessha"};
        String[] asecArray= new String[stringArray.length];
        String[] tempArray= new String[stringArray.length];

         for(int i=0; i<stringArray.length-1; i++){
            for(int j=i+1; j<stringArray.length; j++){
                if(stringArray[i].length()<stringArray[j].length()){
                    asecArray[i]=stringArray[i];
                }else{
                    asecArray[i] = stringArray[j];
                }
            }
        }
        for(int i=0; i< asecArray.length; i++){
            System.out.println(asecArray[i]);
        }
    }
}

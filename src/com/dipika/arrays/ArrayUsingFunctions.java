package com.dipika.arrays;

import  com.dipika.arrays.DivisibleByFive;

public class ArrayUsingFunctions {
    //Function to take int array and print even numbers
    public static void evenNumber(int[] numArray){
        System.out.println("All even numbers of given array are: ");
        for(int i=0; i<numArray.length; i++){
            if(numArray[i]%2==0){
                System.out.print(numArray[i]+" ");
            }
        }
        System.out.println();
    }

    //Function to take int array and return the array of odd Numbers
    public static int[] oddNumber(int[] numArray){

        int [] oddArray= new int[numArray.length];
        int x=0;
        for(int i=0; i<numArray.length; i++){
            if(numArray[i]%2!=0){
             oddArray[x]= numArray[i];
             x++;
            }
        }
        return oddArray;
    }
    // function to take int array and print prime numbers.
    public static void primeNumber(int [] numArray){
        boolean isPrime= false;
        System.out.println("Below are the prime numbers: ");
        for(int i=0; i<numArray.length; i++){
            if (numArray[i]==1){
                System.out.print(numArray[i]+" ");
            }
            for(int j=2; j<numArray[i]-1; j++){
                if(numArray[i]%j==0){
                    isPrime= false;
                    break;
                }else{
                    isPrime= true;
                }
            }
            if(isPrime==true){
                System.out.print(numArray[i]+" ");
            }
        }
    }
    //function to take a number and return weather it is negative or not
    public static boolean negativeNumber(int num){
        boolean isNegative= false;
        if(num<0){
           isNegative= true;
        }else{
            isNegative=false;
        }
        return  isNegative;

    }






    public static void main(String[] args) {
        int [] numberArray={21, 1, 23, -4, 2, 5, 7, -10, 9, 11, 16, -13, 19, 22, 25};
       // for evenNumber method call
        evenNumber(numberArray);
        
        // for oddNumber method call
        System.out.println("All odd numbers of given array are: ");
        int [] oddNumbers = oddNumber(numberArray);
        for(int i=0; i<numberArray.length; i++){
            System.out.print(oddNumbers[i]+" ");
        }
        System.out.println();
        
        // for primeNUmber method call
        primeNumber(numberArray);
        System.out.println();

        //for negativeNumber method call
        System.out.println("Negative numbers are: ");
        for(int i=0; i<numberArray.length; i++){
            boolean isNegative=  negativeNumber(numberArray[i]);
            if(isNegative==true){
                System.out.print(numberArray[i]+ " " );
            }
        }
        
        // for divisiblebyfive method call
        System.out.println();
        System.out.println("Numbers in array that are exactly divisible by five are: ");
        DivisibleByFive.divisibleFive(numberArray);

        //for largestnumber method call
        System.out.println();
        System.out.println("The largest number in given array is: "+
                LargestAndSmallest.largestNumber(numberArray));

        //for smallestNumber method call
        System.out.println();
        //if we donot use static then we should create object of that class
        LargestAndSmallest smallest= new LargestAndSmallest();
        System.out.println("The smallest number of array is: "+smallest.smallestNumber(numberArray));

        //for sumNumber method call
        System.out.println();
        System.out.println("The total sum of all the elements of an array is: "+
                SumOfElementsOfArray.sumNumber(numberArray));

        //for negativeNumber method call
        System.out.println("Negative elements in array are:");
        int [] negativeNumber=CopyArrays.negativeArray(numberArray);
        for(int i=0; i<negativeNumber.length; i++){
            System.out.print(negativeNumber[i]+" ");
        }

        //for positiveArraymethod call
        System.out.println("Positive elements in array are: ");
        int [] positiveNumber=CopyArrays.positiveArray(numberArray);
        for(int i=0; i<positiveNumber.length; i++){
            System.out.print(positiveNumber[i]+" ");
        }
        //for positive using foreach
            /* for (int i : positiveNumber) {
                 System.out.print(i+" ");
             }*/



    }
}

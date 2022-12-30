package com.dipika.stringExamples;

public class StringManipulation61_70 {
    public static void main(String[] args) {
        StringManipulation61_70 sm =new StringManipulation61_70();
        String str="Dipika Upadhaya";
        System.out.println("Original string: "+str);
        System.out.println("Result after removing duplicate is: "+sm.removeDuplicate(str));

        //62
        sm.firstNonRepeatingCharacter("didpikak");
        //63.
        sm.divideStringToNParts("DipikaUpadhayay",3);
        //67
        System.out.println();
        String str1="Ramesh Sigdel";
         sm.reverseStringUsingRecursion(str1);


    }
    //61.Write a Java program to print after removing duplicates from a given string.
    public String removeDuplicate(String str){
        String resultString="";
        char[] strArray=str.toCharArray();
        for(char value:strArray){
            if(resultString.indexOf(value)==-1){
                resultString+=value;
            }
        }
        return resultString;
    }
    //62.Write a Java program to find the first non repeating character in a string.
    public void firstNonRepeatingCharacter(String str){
        System.out.println("Original String: "+str);
        for(int i=0; i<str.length(); i++){
            boolean isUnique= true;
            for(int j=0; j<str.length(); j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                System.out.println("The first non repeating character in String is: "+str.charAt(i));
                break;
            }
        }
    }
    //63. Write a Java program to divide a string in n equal parts
    public void divideStringToNParts(String str, int n){
        int strSize=str.length();
        int partSize=strSize/n;
        System.out.println("The original string is: "+str);
        System.out.println("When given string of size: "+strSize+" is divided into "+n+" equal part of "+partSize+" :");
        for(int i=0; i<strSize; i++){
            if(i%partSize==0) {
                System.out.println();
            }
                System.out.print(str.charAt(i));
        }
    }
    //67.Write a Java program to reverse a string using recursion.
    public void reverseStringUsingRecursion(String str){
       // String resultString="";
        if(str.length()==0 || str.length()<1){
           //return str;
        }else{
            System.out.print(str.charAt(str.length()-1));
           reverseStringUsingRecursion(str.substring(0,str.length()-1));
        }
    }
}

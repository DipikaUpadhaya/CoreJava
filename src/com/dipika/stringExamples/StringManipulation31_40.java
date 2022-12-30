package com.dipika.stringExamples;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class StringManipulation31_40 {
    public static void main(String[] args) {
        StringManipulation31_40 sm=new StringManipulation31_40();
        sm.compareStringLexicographically("I love you ramesh ", "I love you rames");
        //32
        sm.compareStringIgnoreCase("I love you rameshi", "I love you Rameshi");

        //33
        System.out.println("String1 is compare to  specified string buffer: ");
        System.out.println(sm.compareStringtoStringBuffer("Dipika",new StringBuffer("dipika")));

        //34
        sm.newStringFromContentOfCharArray();

        //35.
        System.out.println("Does second string ends with any contents of first string?: ");
        System.out.println(sm.endWithContentOfAnotherString("ramesh", "dipika"));
        //36.
        System.out.println("Does first string and second string contain same data");
        System.out.println(sm.isSameDataOnTwoString("dipika", "dipika"));
        //37.
        System.out.println("Does two string equals using ignore case considerations? :");
        System.out.println(sm.compareStringCaseIgnore("dipika", "DiPiKa"));

        //38.
        sm.printDateAndTime();

        //39.
        sm.getStringContentToByteArray("dipika");

        //40.
        sm.getStringContentToCharArray("Ramesh");

    }
    //31.Write a Java program to compare two strings lexicographically.
    // Two strings are lexicographically equal if they are the same length
    // and contain the same characters in the same positions.
    public void compareStringLexicographically(String str1, String str2){
        int result=str1.compareTo(str2);
        if(result<0){
            System.out.println("String 1 is greater than string 2");
        }else if(result==0){
            System.out.println("String1 is equal to string2");
        }else
            System.out.println("String1 is less than String2");
    }
    //32.Write a Java program to compare two strings lexicographically, ignoring case differences.
    public void compareStringIgnoreCase(String str1, String str2){
        int result= str1.compareToIgnoreCase(str2);
        if(result<0){
            System.out.println("String 1 is greater than string 2");
        }else if(result==0){
            System.out.println("String1 is equal to string2");
        }else
            System.out.println("String1 is less than String2");
    }
    //33.Write a Java program to compare a given string to the specified string buffer.
    public boolean compareStringtoStringBuffer(String str, StringBuffer stringBuffer){
        return str.contentEquals(stringBuffer);
    }
    //34.Write a Java program to create a new String object with the contents of a character array.
    public void newStringFromContentOfCharArray(){
        char[] charArray={'d','r','i','m','p','a'};
        String str= String.copyValueOf(charArray,1,3);
        System.out.println("The string object created from contents of character arrray is: "+str);
    }
    //35.Write a Java program to check whether a given string ends with the contents of another string.
    public boolean endWithContentOfAnotherString(String str1, String str2){
        for(int i=0; i<str1.length(); i++){
            char ch= str1.charAt(i);
            if(str2.endsWith(String.valueOf(ch))){
                return true;
            }
        }
       return false;
    }
    //36.Write a Java program to check whether two String objects contain the same data.
    public boolean isSameDataOnTwoString(String str1, String str2){
        return str2.equals(str1);
    }
    //37.Write a Java program to check whether two String objects contain the same data.
    public boolean compareStringCaseIgnore(String str1, String str2){
        return str2.equalsIgnoreCase(str1);
    }
    //38.Write a Java program to print current date and time in the specified format.
    public void printDateAndTime(){
        System.out.println("Current Date And Time:");
        Date date= new Date();
        DateFormat dateFormat= new SimpleDateFormat("MMMM dd, yyyy");
        System.out.println(dateFormat.format(date));
        DateFormat time= new SimpleDateFormat("hh:mm aa");
        System.out.println(time.format(date));
    }
    //39.Write a Java program to get the contents of a given string as a byte array.
    public void getStringContentToByteArray(String str){
        byte[] byteArray= str.getBytes();
        String newString= new String(byteArray);
        System.out.println("Contents of String as byte array: "+newString);
        /*int byteIndex=0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            byteArray[byteIndex]= (byte) ch;
            byteIndex++;
        }*/
        System.out.println("The contents of string in byte array is represent as: "+ Arrays.toString(byteArray));
    }
    //40.Write a Java program to get the contents of a given string as a character array.
    public void getStringContentToCharArray(String str){
        char[] charArray= str.toCharArray();
        String newStr= new String(charArray);
        System.out.println("The contents of string as char array are; "+String.valueOf(charArray));
    }




}

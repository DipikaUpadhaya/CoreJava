package com.dipika.stringExamples;

//Write a Java program to check whether a given string starts with the contents of another string.

public class StartWithContentOfAnother19 {
    public static void main(String[] args) {
        String str="Hello my Love";
        String str1="my name is.";
        boolean isStart= false;
            /*char ch= str1.charAt(0);
            if(str.contains(ch+"")){
                isStart=true;
            }else
                isStart=false;

        System.out.println("Does a given string,"+"\""+str1+"\""+
                "is start with any contents of another string,"+"\""+str+"\": "+ isStart);*/

        for(int i=0;i<str.length(); i++){
            char ch= str.charAt(i);
            if(str1.startsWith(String.valueOf(ch))){
                isStart=true;
                break;
            }
        }
        System.out.println(isStart);
    }
}

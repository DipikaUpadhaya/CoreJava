package com.dipika.functions;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class FunctionExercises1 {

    //31. to calculate area of triangle
    public void areaOfTriangle(float side1, float side2, float side3){
        float s= (side1+side2+side3)/2;
        double area= Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("The area of given triangle is: "+area);
    }

    //32. to show current date and time
    public void dateAndTime(Date date){
        System.out.println("The current date and time is: "+date.toString());
    }

    //34. to swap two numbers
    public void swapNumber(int num1, int num2){
        System.out.println("Before swapping the numbers are: "+num1+","+num2);
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping the numbers are: "+num1+ ", "+num2);
    }
    //30. to check password is valid or not.
       //A password must have at least ten characters.
       //A password consists of only letters and digits.
       //A password must contain at least two digits.

    public boolean isPasswordValid(String password){
         final int PasswordLength=10;
         int countDigit=0;
         int countLetter=0;
         boolean isValid= false;
        if(password.length()<PasswordLength){
            return isValid;
        }
        for(int i=0; i<password.length(); i++){
            char ch = password.charAt(i);
            if(isNumeric(password.charAt(ch))){
                countDigit++;
            }
        }
        for(int i=0; i<password.length(); i++){
            char ch = password.charAt(i);
            if(countDigit>=2 && (isNumeric(ch) || isLetter(ch))){
                isValid = true;
            } else{
                isValid = false;
            }
        }

        return isValid;

    }
    public boolean isLetter(char ch){
        ch =Character.toUpperCase(ch);
        if ((ch>='A' && ch<='Z')){
            return true;
        }else
            return false;
    }
    public  boolean isNumeric(char ch){
        ch =Character.toUpperCase(ch);
        return ch>=0 && ch<=9;
    }

    //35. to find sum of series  1!/1+2!/2+3!/3+4!/4+5!/5
    public void sumOfSeries(int num){
        int fact=1;
        int sum=0;
        for(int i=1; i<=num; i++){
            fact= fact*i;
            sum=sum+(fact/i);
        }
        System.out.println("The sum of given series is: "+sum);
    }
    //36. to check armstrong number
    public boolean isArmStrong(int num){
        int rem, sum=0;
        int temp=num;
        while(num!=0){
            rem=num%10;
            sum= sum+ rem*rem*rem;
            num=num/10;
        }
        if(temp==sum){
            return true;
        }else
            return  false;
    }
    // to check perfect number
    public  boolean isPerfect(int num){
        int sum=0;
        int temp=num;
        for(int i=1; i<=num/2; i++){
            if(num%i==0){
                sum=sum+i;
            }
            if(temp==sum)
                return true;
        }
        return false;
    }

    //38. to check weather two string are anagram or not
    public boolean isAnagram(char[] str1, char[] str2){
        int s1= str1.length;
        int s2 = str2.length;
        if(s1!=s2){
            return  false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i=0; i<=s1; i++){
            if(str1[i]== str2[i])
                return true;
        }
        return false;
    }

    //function that reads data from one file and writes the data to another file.
    public void readAndWriteFile(){
        File file= new File("New.txt");
        
    }


}

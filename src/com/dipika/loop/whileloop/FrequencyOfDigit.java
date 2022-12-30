package com.dipika.loop.whileloop;

import java.util.Scanner;

public class FrequencyOfDigit {
    public static void main(String[] args) {
        int number, rem;
        int var0 = 0, var1=0, var2=0, var3=0, var4=0, var5=0, var6=0, var7=0, var8=0, var9=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number: ");
        number= scanner.nextInt();
        while(number!=0){
            rem=number%10;
            if(rem==0){
                var0= var0+1;
            }else if(rem==1){
                var1= var1 +1;
            }else if(rem==2){
                var2= var2 +1;
            }else if(rem==3){
                var3= var3 +1;
            }else if(rem==4){
                var4= var4 +1;
            }else if(rem==5){
                var5= var5 +1;
            }else if(rem==6){
                var6= var6 +1;
            }else if(rem==7){
                var7= var7 +1;
            }else if(rem==8){
                var8= var8 +1;
            }else if(rem==9){
                var9= var9 +1;
            }
            number= number/10;
        }
        System.out.println("The frequency of 0 is "+ var0);
        System.out.println("The frequency of 1 is "+ var1);
        System.out.println("The frequency of 2 is "+ var2);
        System.out.println("The frequency of 3 is "+ var3);
        System.out.println("The frequency of 4 is "+ var4);
        System.out.println("The frequency of 5 is "+ var5);
        System.out.println("The frequency of 6 is "+ var6);
        System.out.println("The frequency of 7 is "+ var7);
        System.out.println("The frequency of 8 is "+ var8);
        System.out.println("The frequency of 9 is "+ var9);
    }
}

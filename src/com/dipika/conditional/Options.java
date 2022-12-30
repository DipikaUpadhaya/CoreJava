package com.dipika.conditional;

import java.util.Scanner;

public class Options {
    public static void main(String[] args) {
        System.out.println("******** OPTIONS  ********");
        System.out.println("1. CREATE");
        System.out.println("2. READ");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");

            int optionNumber, num;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please choose any one of the  above options:  ");
        optionNumber= scanner.nextInt();
        System.out.println("How many times you want that chosen options?");
        num= scanner.nextInt();

        if(optionNumber==1){
            for(int i=1; i<=num; i++){
                System.out.println("1. CREATE");
            }
        }else if( optionNumber==2){
            for(int i=1; i<=num; i++){
                System.out.println("2. READ");
            }
        }else if( optionNumber==3){
            for(int i=1; i<=num; i++){
                System.out.println("3. UPDATE");
            }
        }else if(optionNumber==4){
            for(int i=1; i<=num; i++){
                System.out.println("4. DELETE");
            }
        }else{
            System.out.println("TRY AGAIN ");
        }




    }
}

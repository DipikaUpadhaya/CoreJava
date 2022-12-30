package com.dipika.loop.dowhileloop;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuess {
    public static void main(String[] args) {
        Random random= new Random();
        int randomNumber= random.nextInt(100);
        System.out.println(randomNumber);
         int guessNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the random number : ");

        do{
            guessNumber=scanner.nextInt();
            if(guessNumber> randomNumber){
                System.out.println("Too high, try again");
            }else if(guessNumber< randomNumber){
                System.out.println("Too low, try again");
            }
        }while(guessNumber!= randomNumber);
        System.out.println("Congratulation! your guess is correct "+ guessNumber+"=="+ randomNumber);




    }
}

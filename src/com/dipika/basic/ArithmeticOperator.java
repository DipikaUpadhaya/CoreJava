package com.dipika.basic;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        float num1, num2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter first number : ");
        num1= scanner.nextFloat();
        System.out.println("Please enter second number: ");
        num2= scanner.nextFloat();
        if (num1<=0 || num2<=0){
            System.out.println("Please input valid number ");
            return;
        }
        float sum= num1 +num2;
        System.out.println("The sum of given two numbers is: "+ sum);

        float difference= num1-num2;
        System.out.println("The difference of given two number is : "+ difference);

        float product= num1*num2;
        System.out.println("The product of given two numbers is : "+ product);

        float quotient= num1/num2;
        System.out.println("The quotient of given two numbers is : "+ quotient);

        float remainder= num1%num2;
        System.out.println("The remainder of given two numbers is : "+remainder);

    }
}

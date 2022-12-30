package com.dipika.functions;

public class FunctionBank {

    //1. method for display
    public void display(){
        System.out.println("Hello, I am called.");
    }
    //2. method for getTotal
    public int getTotal(int num1, int num2){
        int sum= num1+num2;
        return sum;
    }
    //3. method for product
    public int getProduct(int num1, int num2){
        int product= num1*num2;
        return  product;
    }
    //4. method for circle
    public void areaOfCircle(float  radius){
        float area= 3.14f*radius*radius;
        double circumference= 2* 3.14* radius;
        System.out.println("The area of circle is: "+ area);
        System.out.println("The circumference of circle is: "+ circumference);
    }
    //5. method for eligibleToVote
    public boolean isEligibleToVote(int age){
        if(age>18){
            return true;
        }
        return false;
    }
    //6. method for factorial
    public int getFactorial(int number){
        int fact=1;
        for(int i=1; i<=number; i++){
            fact=fact*i;
        }
        return fact;
    }
    //7. method for average number
    public void averageNumber(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            System.out.println("Highest number is: "+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("Highest number is: "+num2);
        }else{
            System.out.println("Highest number is: "+num3);
        }

        if(num1<num2 && num1<num3){
            System.out.println("Lowest number is: "+num1);
        }else if(num2<num1 && num2<num3){
            System.out.println("Lowest number is: "+num2);
        }else{
            System.out.println("Lowest number is: "+num3);
        }
    }

    //8. method for sum of three number
    public int sumOfNumber(int num1,int num2, int num3){
        int sum= num1+num2+num3;
        return sum;
    }
    //9. method for even number checked
    public boolean isEven(int num){
        if(num%2==0){
            return true;
        }else
            return false;
    }
    //10. method for display numbers in range
    public void displayRange(int start, int end){
        System.out.println("The numbers between range "+start+" and "+end+" is ");
        for(int i=start; i<end; i++){
            System.out.print(i+" ");
        }
    }
}

package com.dipika.functions;

public class FunctionExercise {
    //11.to display odd numbers in range
    public void oddNumbersInRange(int start, int end) {
        System.out.println("The odd numbers between range " + start + " and " + end + " are: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    //12. to check prime number
    public boolean checkPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }

    //13. to display prime numbers between 1 to 1000
    public void primeNumbers(int start, int end) {
        boolean isPrime = true;
        int count = 0;
        System.out.println("The prime numbers between " + start + " and " + end + " are ");
        for (int i = start; i < end; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = 0;
                    break;
                } else {
                    count = 1;
                }
            }
            if (count == 1) {
                System.out.print(i + " ");
            }

        }
    }

    //14. to print multiplication table
    public void printMultiplication(int num) {
        System.out.println("Multiplication table of given num, " + num + " is ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }

    //15. to return the length of number
    public int lengthOfNumber(int num) {
        int len = String.valueOf(num).length();
        return len;
    }

    //16.to count all words of a string
    public int countWords(String name) {
        String[] array = name.split(" ");
        return array.length;
    }

    //17. to return true when both parameters are same
    public boolean isSameNum(int num1, int num2) {
        if (num1 == num2) {
            return true;
        } else
            return false;
    }

    //18. to print maximum number among three number entered by user
    public int maximumNumber(int num1, int num2, int num3) {
        int max;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        return max;
    }

    //19. to print sum of numbers entered by user
    public int sumOfNumber(int num1, int num2, int num3) {
        int sum = num1 + num3 + num2;
        return sum;
    }

    //20. to display grade according to marks
    public void gradeOfStudents(int marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade AA");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade AB");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade BB");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade BC");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("Grade CD");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("Grade DD");
        } else {
            System.out.println("Fail");
        }
    }

    //21.to check number is pallindrome or not
    public boolean isPallindrome(int number) {
        int rem, reverse = 0;
        int temp = number;
        while (temp != 0) {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }
        if (reverse == number) {
            return true;
        } else
            return false;
    }

    //22. to check vowel
    public boolean isVowel(char ch) {
        switch (ch) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                return true;
            default:
                return  false;

        }
    }

    //23. to check if string contains vowel
    public boolean containVowel(String name){
        char[] charArray=name.toCharArray();
        boolean containVowel = false;
        for(int i=0; i<charArray.length; i++){
            containVowel = isVowel(charArray[i]);
        if(containVowel)
            return containVowel;
        }
        return containVowel;
    }

    //24.find factorial using recursion
    public int factorialRecursion(int num) {
        int fact = 1;
        if (num > 1) {
            return num * factorialRecursion(num - 1);
        } else
            return 1;
    }

    //25.find gcd using Recursion
    public int gcdRecursion(int num1, int num2){
        if(num2!=0){
            return gcdRecursion(num2, num1%num2);
        }else
        return num1;
    }

    //to check weather a year is leap year or not
    public boolean isLeapYear(int year){
        if((year%4==0 && year%100!=0 )|| (year%100==0 && year%400==0)){
            return true;
        }else
        return false;
    }
}

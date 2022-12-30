package com.dipika.abstraction.marks;

public class MainMethod {
    public static void main(String[] args) {
        StudentA studentA= new StudentA(50, 55, 78);
        StudentB studentB= new StudentB(54, 67, 98,78);
        System.out.println("The percentage of student A is: "+studentA.getPercentage()+"%");
        System.out.println("The percentage of student B is: "+studentB.getPercentage()+"%");
    }
}

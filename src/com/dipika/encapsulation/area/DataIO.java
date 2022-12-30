package com.dipika.encapsulation.area;

import java.util.Scanner;

public class DataIO {
    private Scanner scanner= new Scanner(System.in);

    private String readData(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
    public void display(String message, Object data){
        System.out.println(message+" "+data);
    }

    public Triangle readTriangleData(){
        Triangle triangle= new Triangle();
        triangle.setSide1(Float.parseFloat(readData("Enter side 1 of triangle")));
        triangle.setSide2(Float.parseFloat(readData("Enter side2 of triangle")));
        triangle.setSide3(Float.parseFloat(readData("Enter side3 of triangle")));
        return triangle;
    }
    public Square readSquareData(){
        Square square= new Square();
        square.setLength(Float.parseFloat(readData("Enter length of square: ")));
        return square;
    }

}

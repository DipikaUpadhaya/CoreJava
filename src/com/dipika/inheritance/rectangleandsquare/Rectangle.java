package com.dipika.inheritance.rectangleandsquare;

public class Rectangle {
    private float length;
    private  float breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void calculatePerimeter(){
        float perimeter= 2*(length+breadth);
        System.out.println("The perimeter of rectangle is: "+perimeter);
    }
    public void calculateArea(){
        float area= length*breadth;
        System.out.println("The area of rectangle is: "+area);
    }
}

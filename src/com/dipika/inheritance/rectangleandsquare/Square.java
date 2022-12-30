package com.dipika.inheritance.rectangleandsquare;

public class Square extends  Rectangle{
 private float side;
    public Square(float side) {
        super(side, side);
        this.side=side;
    }
    public void areaSquare(){
        float area= side * side;
        System.out.println("The area of square is: "+ area);
    }
    public void perimeterSquare(){
        float perimeter= 4*side;
        System.out.println("The perimeter of square is: "+perimeter);
    }




}

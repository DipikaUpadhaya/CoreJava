package com.dipika.abstraction.shape;

import java.util.ArrayList;

public class MainArea {
    public static void main(String[] args) {
        Area area= new Area();
        System.out.println("The area of rectangle is: "+area.rectangleArea(5, 7));
        System.out.println("The area of square is: "+ area.squareArea(5));
        System.out.println("The area of circle is: "+area.circleArea(4));

    }
}

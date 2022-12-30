package com.dipika.encapsulation;

public class Area {
    private float length;
    private float breadth;

    public Area(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea(){
        float area= length*breadth;
        System.out.println("the area is :"+area);
    }


}

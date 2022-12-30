package com.dipika.encapsulation.area;

public class Square {
    float length;


    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }


    public float calculatePerimeter(){
        return 4*length;
    }
    public float calculateArea(){
        float area= length*length;
        return area;
    }
}

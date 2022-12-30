package com.dipika.abstraction.shape;

public class Area extends Shape{
    private float length, breadth, side, radius;

    public Area(){
    }

    public Area(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Area(float side) {
        this.side = side;
    }


    @Override
    public float rectangleArea(float length, float breadth) {
        return length*breadth;
    }

    @Override
    public float squareArea(float side) {
        return side*side;
    }

    @Override
    public double circleArea(float radius) {
        return Math.PI*radius*radius;
    }
}

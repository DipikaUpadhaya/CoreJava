package com.dipika.abstraction.example;

public class Subclass extends AbstarctExample{

    @Override
    public void a_method() {
        System.out.println("This is abstract method.");
    }

    public static void main(String[] args) {
        Subclass subclass= new Subclass();
        subclass.a_method();
        subclass.nonAbstract();
    }
}

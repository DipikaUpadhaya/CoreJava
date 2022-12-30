package com.dipika.abstraction.example;

public abstract class AbstarctExample {

    //this is constructor
    public AbstarctExample(){
        System.out.println(" This is a constructor of abstract class");
    }
    //this is abstract method
    public abstract void a_method();

    //this is non abstract method
    public void nonAbstract(){
        System.out.println("This is normal method of abstract class.");
    }
}

package com.dipika.inheritance;

public class MainClass {
    public static void main(String[] args) {
        ParentClass p= new ParentClass();
        p.displayParent();
        ChildClass c= new ChildClass();
        c.displayChild();
        c.displayParent();

        Square square= new Square();
        square.displayShape();
        square.displayRectangle();
        square.displaySqaure();
    }

}

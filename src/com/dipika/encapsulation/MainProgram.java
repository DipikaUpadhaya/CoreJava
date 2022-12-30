package com.dipika.encapsulation;

public class MainProgram {
    public static void main(String[] args) {
        Area rectangle= new Area(2.0f, 6.0f);
        rectangle.calculateArea();

        Employee employee= new Employee(26, "Dipa", "Texas", 60000);
        System.out.println("Setting data using constructor: ");
        System.out.println("Name: "+employee.getName());
        System.out.println("Age: "+employee.getAge());
        System.out.println("Address: "+employee.getAddress());
        System.out.println("Salary: "+employee.getSalary());

        employee.setAge(25);
        employee.setName("Dipika");
        employee.setAddress("TX");
        employee.setSalary(500000);

        System.out.println();
        System.out.println("Employee information using setter: ");
        System.out.println("Name: "+employee.getName());
        System.out.println("Age: "+employee.getAge());
        System.out.println("Address: "+employee.getAddress());
        System.out.println("Salary: "+employee.getSalary());


    }

}

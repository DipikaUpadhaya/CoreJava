package com.dipika.encapsulation;

public class Employee {
    private int age;
    private String name;
    private String address;
    private double salary;

    public Employee(int age, String name, String address, double salary) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

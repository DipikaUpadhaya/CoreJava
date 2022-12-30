package com.dipika.inheritance.classRelationship;

//Engineer IS-A Employee
public class Engineer extends Employee{
    private String engineerskills;
    private String sector;
    private  double salary;


    public Engineer(int id, String name, String address, String email,
                    String engineerskills, String sector, double salary) {
        super(id, name, address, email);
        this.engineerskills=engineerskills;
        this.salary=salary;
        this.sector=sector;
    }

    public String getEngineerskills() {
        return engineerskills;
    }

    public void setEngineerskills(String engineerskills) {
        this.engineerskills = engineerskills;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

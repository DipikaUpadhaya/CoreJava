package com.dipika.inheritance.classRelationship;

//Manager IS-A Employee
public class Manager extends  Employee{
    private String managerSkills;
    private  double salary;

    public Manager(int id, String name, String address, String email, String managerSkills, double salary) {
        super(id, name, address, email);
        this.managerSkills=managerSkills;
        this.salary=salary;
    }

    public String getManagerSkills() {
        return managerSkills;
    }

    public void setManagerSkills(String managerSkills) {
        this.managerSkills = managerSkills;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", email='" +getEmail() + '\'' +
                ", department=" + getDepartment() +
                ", designation=" + getDesignation() +
                ", managerSkills="+managerSkills+
                ", salary="+salary+
                '}';
    }
}

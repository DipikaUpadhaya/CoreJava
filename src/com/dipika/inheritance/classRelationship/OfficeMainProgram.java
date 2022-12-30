package com.dipika.inheritance.classRelationship;

public class OfficeMainProgram {
    public static void main(String[] args) {
        Manager manager= new Manager(101, "Dipika", "TEXAS", "dipikagm",
                "Decisionmaking", 650000);
        manager.setDepartment(new Department(1, "Management"));
        manager.setDesignation(new Designation(2, "BranchManager"));

        System.out.println(manager);

    }
}

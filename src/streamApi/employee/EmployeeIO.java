package streamApi.employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeIO {

    Scanner scanner= new Scanner(System.in);



    public Employee readEmployeeData(){
        Employee employee= new Employee();
        System.out.println("Enter your id: ");
        employee.setId(scanner.nextInt());

        System.out.println("Enter your age: ");
        employee.setAge(scanner.nextInt());

        System.out.println("Enter your salary: ");
        employee.setSalary(scanner.nextDouble());

        System.out.println("Enter your experience: ");
        employee.setExperience(scanner.nextFloat());

        System.out.println("Enter your name: ");
        employee.setName(scanner.next());

        System.out.println("Enter your address: ");
        employee.setAddress(scanner.next());

        System.out.println("Enter your email: ");
        employee.setEmail(scanner.next());

        System.out.println("Enter your mobile number: ");
        employee.setMobileNumber(scanner.next());

        System.out.println("Enter your designation: ");
        employee.setDesignation(scanner.next());


        return employee;
    }

    public void displayEmployeeData(Employee employee){
        System.out.println("Id: "+employee.getId());
        System.out.println("Name: "+employee.getName());
        System.out.println("Address: "+employee.getAddress());
        System.out.println("Email: "+employee.getEmail());
        System.out.println("Mobile Number: "+employee.getMobileNumber());
        System.out.println("Designation: "+employee.getDesignation());
        System.out.println("Age: "+employee.getAge());
        System.out.println("Salary: "+employee.getSalary());
        System.out.println("Experience: "+employee.getExperience());
    }
    public void displayEmployeeList(List<Employee> employeeList){
        for(Employee employee:employeeList){
            displayEmployeeData(employee);
        }

    }



}

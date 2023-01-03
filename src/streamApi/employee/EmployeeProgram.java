package streamApi.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeProgram {
    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee( 1, "dipika", "Tx", "dipika@gmail", "12345678901",
        25, "developer", 50000, 3.0f));
        employeeList.add(new Employee( 2, "dipi", "Tx", "dipi@hotmail", "1234567890",
                20, "dcto", 60000, 3.0f));
        employeeList.add(new Employee( 3, "ramesh", "Tx", "raa@gmail", "123456789",
                26, "cto", 10000, 3.0f));
        employeeList.add(new Employee( 4, "swarnim", "Tx", "sawa@gmail.com", "1234567890112",
                31, "developer", 20000, 3.0f));
        employeeList.add(new Employee( 5, "sagar", "Tx", "dipika@Yahoo", "1234567890",
                28, "hr", 15000, 3.0f));
        employeeList.add(new Employee( 6, "malati", "Tx", "dipika@gmail", "1234567890",
                21, "er", 500000, 3.0f));
        employeeList.add(new Employee( 7, "dipikash", "Tx", "dipika@gmail", "12345678901132",
                29, "cto", 500, 3.0f));
        employeeList.add(new Employee( 8, "dipesh", "Tx", "dipika@gmail", "12345678",
                23, "dr", 70000, 3.0f));

        EmployeeIO employeeIO= new EmployeeIO();
        /*for(int i=1; i<=5; i++){
            employeeList.add(employeeIO.readEmployeeData());
        }*/
        employeeIO.displayEmployeeList(employeeList);

        //Filter the employees whose salary is greater than 20000.
        List<Employee> salaryGreater=employeeList.stream().filter(employee -> employee.getSalary()>20000).collect(Collectors.toList());
        System.out.println("List of employee whose salary is greater than 20000");
        employeeIO.displayEmployeeList(salaryGreater);
       // System.out.println(salaryGreater);

        //Filter the employees whose designation is CTO or DCTO.
        List<Employee> designationCTO=employeeList.stream()
                .filter(employee -> employee.getDesignation().equalsIgnoreCase("CTO")||
                        employee.getDesignation().equalsIgnoreCase("DCTO")).collect(Collectors.toList());
        System.out.println("List of employee whose designation is cto or dcto");
        employeeIO.displayEmployeeList(designationCTO);

        //Filter the employee whose age is between 20 and 25 and salary is less than 15000.
        List<Employee> filterAgeAndSalary= employeeList.stream()
                .filter(employee -> employee.getAge()>20 && employee.getAge()<25 &&
                        employee.getSalary()<15000).collect(Collectors.toList());
        System.out.println("List of employee whose age is between 20 and 25 and salary is less than 15000: ");
        employeeIO.displayEmployeeList(filterAgeAndSalary);

        //Filter the employees who are using gmail.
        List<Employee> filterEmail= employeeList.stream()
                .filter(employee -> employee.getEmail().contains("gmail")).collect(Collectors.toList());
        System.out.println("List of employee using gmail are: ");
        employeeIO.displayEmployeeList(filterEmail);

        //Filter the employee whose mobile number length is not equal to 10.
        List<Employee> filterMobilenUmber= employeeList.stream()
                .filter(employee -> employee.getMobileNumber().length()!=10).collect(Collectors.toList());
        System.out.println("List of employee whose mobile number length is not equal to 10: ");
        employeeIO.displayEmployeeList(filterMobilenUmber);

        //Filter the employees whose name starts from “s” and age is greater than 25.
        List<Employee> filterName= employeeList.stream()
                .filter(employee -> employee.getName().startsWith("s") && employee.getAge()>25).collect(Collectors.toList());
        System.out.println("list of  employees whose name starts from “s” and age is greater than 25: ");
        employeeIO.displayEmployeeList(filterName);

        //

    }
}

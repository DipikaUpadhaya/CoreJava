package streamApi.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortingProgram {
    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(3,"Dipika", 2,50000));
        employeeList.add(new Employee(1,"Ramesh", 6,80000));
        employeeList.add(new Employee(4,"Hridhaya", 1,10000));
        employeeList.add(new Employee(2,"Sabina", 5,90000));

        System.out.println("Before sorting:  ");
        System.out.println(employeeList);
        List<Employee> sortedList= employeeList.stream().sorted().collect(Collectors.toList());
        System.out.println("After Sorting: ");
        System.out.println(sortedList);
    }
}

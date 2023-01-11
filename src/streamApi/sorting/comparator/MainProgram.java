package streamApi.sorting.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainProgram {
    public static void main(String[] args) {
        List<Student> studentList= new ArrayList<>();
        studentList.add(new Student(3,"Ramesh",15,60000));
        studentList.add(new Student(1,"Dipika",10,90000));
        studentList.add(new Student(5,"Subash",14,40000));
        studentList.add(new Student(2,"Malati",9,10000));
        studentList.add(new Student(4,"Subham",5,70000));
        System.out.println("Before sorting: ");
        System.out.println(studentList);

        List<Student> filteredList= new ArrayList<>();
        filteredList= studentList.stream().sorted(new NameComparator()).collect(Collectors.toList());
        filteredList= studentList.stream().sorted(new FeeComparator()).collect(Collectors.toList());

        System.out.println("Using name comparator: ");
        System.out.println(filteredList);
        System.out.println("Using fee comparator: ");
        System.out.println(filteredList);

    }
}

package streamApi.sorting;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private int experience;
    private double salary;

    public Employee(int id, String name, int experience, double salary) {
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if(id==o.getId()){
            return 0;
        }else if(id>o.getId()){
            return 1;
        }else
        return -1;
    }
}

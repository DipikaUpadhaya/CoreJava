package streamApi.sorting.comparator;

public class Student {
    private int id;
    private String name;
    private int grade;
    private double fee;

    public Student(int id, String name, int grade, double fee) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", experience=" + grade +
                ", salary=" + fee +
                '}';
    }
}

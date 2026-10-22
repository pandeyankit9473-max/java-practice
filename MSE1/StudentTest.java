class Student {
    private String name;
    private int rollNo;
    private double marks;

    static int studentCount = 0;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        studentCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101, 85.5);
        Student s2 = new Student("Priya", 102, 91.0);

        System.out.println(s1.getName());
        System.out.println("Marks: " + s2.getMarks());
        System.out.println("Total Students: " + Student.studentCount);
    }
}
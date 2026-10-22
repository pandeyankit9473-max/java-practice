
import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {

        int result = Integer.compare(this.age, other.age);

        System.out.println(
            "Comparing " + this.name + " (" + this.age + ") with "
            + other.name + " (" + other.age + ")"
        );

        System.out.println("compareTo returns: " + result);
        System.out.println("--------------------");

        return result;
    }
}

public class comprable {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Rahul", 21));
        students.add(new Student("Aman", 18));
        students.add(new Student("Priya", 20));

        System.out.println("Sorting students...\n");

        Collections.sort(students);

        System.out.println("\nFinal sorted list:");

        for (Student s : students) {
            System.out.println(s.name + " " + s.age);
        }
    }
}
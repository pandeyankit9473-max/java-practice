import java.util.Scanner;

class Student {

    String name;
    String[] courses = new String[5];
    int count = 0;

    Student(String name) {
        this.name = name;
    }

    void addCourse(String course) {

        if (count < 5) {
            courses[count] = course;
            count++;
            System.out.println("Course added: " + course);
        } else {
            System.out.println("Maximum 5 courses can be added.");
        }
    }

    void displayCources() {

        System.out.println("Student Name: " + name);

        for (int i = 0; i < count; i++) {
            System.out.println("Course " + (i + 1) + ": " + courses[i]);
        }
    }
}

public class CourseDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        Student s1 = new Student(name);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter course: ");
            String course = sc.nextLine();

            s1.addCourse(course);
        }

        s1.displayCources();
    }
}
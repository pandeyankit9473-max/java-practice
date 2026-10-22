import java.util.Scanner;

public class Student {

    String name;

    int m1;
    int m2;
    int m3;
    int m4;
    int m5;

    void input(String name, int m1, int m2, int m3, int m4, int m5) {

        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }

    int calculate() {

        return this.m1 + this.m2 + this.m3 + this.m4 + this.m5;
    }

    double calculatePercentage() {

        return calculate() / 5.0;
    }

    void display() {

        double percentage = calculatePercentage();

        String grade;

        if (percentage >= 90) {
            grade = "A+";
        }
        else if (percentage >= 80) {
            grade = "A";
        }
        else if (percentage >= 70) {
            grade = "B";
        }
        else if (percentage >= 60) {
            grade = "C";
        }
        else if (percentage >= 50) {
            grade = "D";
        }
        else {
            grade = "F";
        }

        System.out.println("Name: " + name);
        System.out.println("Total: " + calculate());
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        if (percentage >= 50) {
            System.out.println("Result: Pass");
        }
        else {
            System.out.println("Result: Fail");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks of subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of subject 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter marks of subject 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter marks of subject 5: ");
        int m5 = sc.nextInt();

        // Creating Student object
        Student student = new Student();

        // Giving data to the object
        student.input(name, m1, m2, m3, m4, m5);

        // Display result
        student.display();

        sc.close();
    }
}
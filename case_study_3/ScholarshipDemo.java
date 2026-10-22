import java.util.Stack;
import java.util.Scanner;

class Scholarship {

    Stack<Integer> students = new Stack<>();

    void addStudent(int percentage) {
        students.push(percentage);
    }

    void processStudents() {

        while (!students.isEmpty()) {

            int percentage = students.pop();
            int scholarship;

            if (percentage >= 90) {
                scholarship = 20000;
            } else if (percentage >= 80) {
                scholarship = 15000;
            } else if (percentage >= 70) {
                scholarship = 10000;
            } else if (percentage >= 60) {
                scholarship = 5000;
            } else {
                scholarship = 0;
            }

            System.out.println("Percentage: " + percentage);
            System.out.println("Scholarship: " + scholarship);
        }
    }
}

public class ScholarshipDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Scholarship s = new Scholarship();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter percentage: ");
            int percentage = sc.nextInt();
            s.addStudent(percentage);
        }

        s.processStudents();
    }
}
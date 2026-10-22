import java.util.ArrayList;
import java.util.Scanner;

class StudentMarks {

    ArrayList<Integer> marks = new ArrayList<>();

    void addMarks(int mark) {
        marks.add(mark);
    }

    void calculateResult() {

        int total = 0;

        for (int x : marks) {
            total += x;
        }

        double percentage = total / 5.0;

        String grade;

        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}

public class StudentMarksDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentMarks s = new StudentMarks();

        for (int i = 0; i < 5; i++) {
            int mark = sc.nextInt();
            s.addMarks(mark);
        }

        s.calculateResult();
    }
}
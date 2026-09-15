import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks of 5 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        // Calculate total and percentage
        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5.0;

        // Calculate grade
        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "F";

        // Pass or Fail
        String result;
        if (percentage >= 50)
            result = "Pass";
        else
            result = "Fail";

        // Output
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);

        sc.close();
    }
}
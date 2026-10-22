import java.util.Scanner;
class StudentMarks{
    String name;
    int NoOfsub;
    StudentMarks(String name, int NoOfsub){
        this.name=name;
        this.NoOfsub=NoOfsub;
    }
     // Method to calculate average
    void calculateResult(Scanner sc) {

        if (NoOfsub <= 0)
            throw new ArithmeticException("No subjects entered");

        int total = 0;

        for (int i = 1; i <= NoOfsub; i++) {

            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100)
                throw new IllegalArgumentException(
                    "Marks must be between 0 and 100"
                );

            total += marks;
        }

        double average = total / (double) NoOfsub;

        System.out.println("Student: " + name);
        System.out.println("Average marks: " + average);
    }
}



public class marks {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        StudentMarks s1 = new StudentMarks(name, n);

        try {
            s1.calculateResult(sc);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

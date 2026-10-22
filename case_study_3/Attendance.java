import java.util.ArrayList;

public class Attendance {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Ankit");
        students.add("Rahul");
        students.add("Aman");

        System.out.println("Students: " + students);

        if (students.contains("Ankit")) {
            System.out.println("Student found");
        }

        students.remove("Rahul");

        System.out.println("After removal: " + students);

        System.out.println("Total students: " + students.size());
    }
}
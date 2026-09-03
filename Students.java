 class Student {
    String name;
    int age;
    int marks;

    static String college = "KIET";

    // No-argument constructor
    Student() {
        System.out.println("Student created");
    }

    // Parameterized constructor
    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Method
    void displayInfo() {
        System.out.println(name + " " + age + " " + marks);
    }

    // Method Overloading
    void displayInfo(String message) {
        System.out.println(message + " " + name);
    }
}

public class Students {
    public static void main(String[] args) {
        Student s1 = new Student("Ankit", 20, 85);
        Student s2 = new Student("Rahul", 21, 90);

        s1.displayInfo();
        s2.displayInfo();

        s1.displayInfo("Student:");

        System.out.println(Student.college);

        Student s3 = new Student();
    }
}

// class Student {                 ← CLASS
// │
// ├── String name;                ← VARIABLE
// ├── int age;                    ← VARIABLE
// │
// ├── Student(...) { }            ← CONSTRUCTOR
// │
// └── public void display() { }   ← METHOD
// }

// public class Students {         ← ANOTHER CLASS
// │
// └── public static void main()   ← METHOD
// }
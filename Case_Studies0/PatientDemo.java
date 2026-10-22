import java.util.Scanner;

class Patient {

    int patientId;
    String name;
    int age;
    double temperature;

    Patient(int patientId, String name, int age, double temperature) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.temperature = temperature;
    }

    void checkFever() {
        if (temperature > 100.4) {
            System.out.println("Fever");
        } else {
            System.out.println("Normal");
        }
    }
}

public class PatientDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter patient ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter patient name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        Patient p1 = new Patient(id, name, age, temperature);

        p1.checkFever();

        sc.close();
    }
}
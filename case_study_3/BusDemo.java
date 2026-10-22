import java.util.Scanner;
import java.util.Vector;

class BusReservation {

    Vector<Integer> ages = new Vector<>();

    void addAge(int age) {
        ages.add(age);
    }

    void calculateFare() {

        for (int age : ages) {

            double fare;

            if (age < 5) {
                fare = 0;
            } else if (age <= 12) {
                fare = 500 - 500 * 0.50;
            } else if (age <= 59) {
                fare = 500;
            } else {
                fare = 500 - 500 * 0.30;
            }

            System.out.println("Age: " + age);
            System.out.println("Fare: " + fare);
        }
    }
}

public class BusDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BusReservation b = new BusReservation();

        System.out.print("Enter number of passengers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            b.addAge(age);
        }

        b.calculateFare();
    }
}
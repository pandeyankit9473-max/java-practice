import java.util.Stack;
import java.util.Scanner;

class Parking {

    Stack<String> cars = new Stack<>();

    void addCar(String car) {
        if (cars.size() < 5) {
            cars.push(car);
            System.out.println("Car parked: " + car);
        } else {
            System.out.println("Parking is full");
        }
    }

    void removeCar() {
        if (!cars.isEmpty()) {
            System.out.println("Car removed: " + cars.pop());
        }
    }

    void displayCars() {
        System.out.println("Remaining Cars: " + cars);
    }

    void calculateCharge(int hours) {
        int charge;

        if (hours <= 2) {
            charge = 50;
        } else {
            charge = 50 + (hours - 2) * 20;
        }

        System.out.println("Parking Charge: " + charge);
    }
}

public class ParkingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Parking p = new Parking();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter car number: ");
            String car = sc.nextLine();
            p.addCar(car);
        }

        p.removeCar();
        p.displayCars();

        System.out.print("Enter parking hours: ");
        int hours = sc.nextInt();

        p.calculateCharge(hours);
    }
}
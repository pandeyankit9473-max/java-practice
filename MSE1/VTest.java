interface Vehicle {
    void displaySpeed();
}

class Car implements Vehicle {
    public void displaySpeed() {
        System.out.println("Car Maximum Speed: 180 km/h");
    }
}

class Bike implements Vehicle {
    public void displaySpeed() {
        System.out.println("Bike Maximum Speed: 120 km/h");
    }
}

public class VTest {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.displaySpeed();
        v2.displaySpeed();
    }
}
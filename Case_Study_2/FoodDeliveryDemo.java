class Food extends Thread {

    public void run() {
        System.out.println("Food is being prepared");
        System.out.println("Food preparation completed");
    }
}

class Delivery extends Thread {

    public void run() {
        System.out.println("Food is delivered");
    }
}

public class FoodDeliveryDemo {

    public static void main(String[] args) {

        Food t1 = new Food();
        Delivery t2 = new Delivery();

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }

        t2.start();
    }
}
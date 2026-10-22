import java.util.ArrayList;
import java.util.Scanner;

class Shopping {

    ArrayList<Integer> prices = new ArrayList<>();

    void addPrice(int price) {
        prices.add(price);
    }

    void calculateBill() {

        int total = 0;

        for (int price : prices) {
            total += price;
        }

        double discount;

        if (total >= 10000) {
            discount = total * 0.20;
        } else if (total >= 5000) {
            discount = total * 0.10;
        } else if (total >= 2000) {
            discount = total * 0.05;
        } else {
            discount = 0;
        }

        double finalAmount = total - discount;

        System.out.println("Total: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }
}

public class ShoppingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Shopping s = new Shopping();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price: ");
            int price = sc.nextInt();
            s.addPrice(price);
        }

        s.calculateBill();
    }
}
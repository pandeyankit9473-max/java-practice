import java.util.Scanner;

class Product {

    int productId;
    String productName;
    double price;
    int quantity;

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateCost() {
        return price * quantity;
    }

    void displayProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Total Cost: " + calculateCost());
    }
}

public class ShoppingCart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        Product p1 = new Product(id, name, price, quantity);

        double totalBill = p1.calculateCost();

        p1.displayProduct();

        System.out.println("Total Bill: " + totalBill);

        if (totalBill > 5000) {
            double discount = totalBill * 0.10;
            double finalBill = totalBill - discount;

            System.out.println("Discount: " + discount);
            System.out.println("Final Bill: " + finalBill);
        } else {
            System.out.println("No discount");
        }

        sc.close();
    }
}
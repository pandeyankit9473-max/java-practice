class Product {
    String name;
    double price;
    String category;

    Product(String name) {
        this.name = name;
        this.price = 0;
        this.category = "General";
    }

    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("Keyboard");

        Product p2 =
            new Product("Laptop", 55000, "Electronics");

        p1.display();
        p2.display();
    }
}
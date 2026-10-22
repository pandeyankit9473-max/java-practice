import java.util.Scanner;
class Shooping{
    int price, quantity;
    double discount;
    
    Shooping(int price, int quantity, double discount){
        this.price= price;
        this.quantity= quantity;
        this.discount= discount;
    }
    double calculateBill(){
        int total= price*quantity;
        if(price<=0)
            throw new IllegalArgumentException("Invalid price");
        if(quantity<=0)
            throw new IllegalArgumentException("Invalid quantity");
        if(discount<0 || discount>100)
            throw new IllegalArgumentException("Invalid discount");

        double discountamount= total*discount/100;

        return total-discountamount;

    }

}




public class Discount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            System.out.print("Enter price: ");
            int price = sc.nextInt();
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            System.out.print("discount percentage: ");
            double discount = sc.nextDouble();
            Shooping p1= new Shooping(price, quantity,discount);

            double finalBill= p1.calculateBill();

            System.out.println("final Bill:"+ finalBill);

            System.out.print("Enter payment amount: ");
            double payment = sc.nextDouble();

            if(payment < finalBill)
                throw new Exception("Payment amount less than the bill");

              System.out.println("Payment successful!");


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

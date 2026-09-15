
import java.util.Scanner;

public class BusBooking {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int availableSeats=20;
        try {
            System.out.println("Enter age: ");
            int age= sc.nextInt();
            if(age<=0)
                throw new Exception("Invalid age");
            System.out.println("Enter no of seat: ");
            int seat= sc.nextInt();
            if(seat<=0)
                throw new Exception("Invalid no of seats");
            else if(seat>availableSeats)
                throw new Exception("Insufficent seats");
            
            System.out.println("Booking successful!");


        } catch (Exception e) {
             System.out.println(e.getMessage());
        }
    }
}

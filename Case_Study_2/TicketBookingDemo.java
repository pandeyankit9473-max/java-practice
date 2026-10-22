


class TicketBooking {
    private int seats = 5;

    synchronized void bookTicket(int requestedSeats, String customer) {
        if (seats >= requestedSeats) {
            System.out.println(customer + " is booking " + requestedSeats + " seat(s)");

            seats = seats - requestedSeats;

            System.out.println(customer + " booking completed");
            System.out.println("Remaining seats: " + seats);
        } else {
            System.out.println(customer + " cannot book " + requestedSeats + " seat(s)");
            System.out.println("Not enough seats available");
        }
    }
}

class Customer extends Thread {
    TicketBooking booking;
    int seats;
    String customerName;

    Customer(TicketBooking booking, int seats, String customerName) {
        this.booking = booking;
        this.seats = seats;
        this.customerName = customerName;
    }

    public void run() {
        booking.bookTicket(seats, customerName);
    }
}

public class TicketBookingDemo {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        Customer c1 = new Customer(booking, 2, "Customer 1");
        Customer c2 = new Customer(booking, 2, "Customer 2");
        Customer c3 = new Customer(booking, 2, "Customer 3");

        c1.start();
        c2.start();
        c3.start();
    }
}
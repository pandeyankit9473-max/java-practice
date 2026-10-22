import java.util.Scanner;

class ATM {

    int balance = 10000;
    int correctPin = 1234;

    void checkPin() {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPin) {
                System.out.println("PIN is correct");
                return;
            } else {
                System.out.println("Wrong PIN");
            }
        }

        System.out.println("Maximum attempts reached");
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class ATMDemo {

    public static void main(String[] args) {

        ATM a1 = new ATM();

        a1.checkPin();

        a1.displayBalance();

        a1.deposit(2000);

        a1.withdraw(3000);

        a1.displayBalance();
    }
}
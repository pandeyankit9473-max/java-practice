import java.util.Stack;

class ATM {

    Stack<Integer> transactions = new Stack<>();
    int balance = 20000;

    void withdraw(int amount) {

        if (amount <= balance) {
            balance = balance - amount;
            transactions.push(amount);
            System.out.println("Withdrawal successful: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void latestTransaction() {
        System.out.println("Latest Transaction: " + transactions.peek());
    }
}

public class ATMDemo {

    public static void main(String[] args) {

        ATM a = new ATM();

        a.withdraw(5000);
        a.withdraw(3000);
        a.withdraw(8000);
        a.withdraw(6000);

        a.latestTransaction();
    }
}
import java.util.Scanner;

class Bank{
    private  int balance= 5000;
    void withdraw(int amount){
        if(amount<=0)
            throw new IllegalArgumentException("Invalid withdrawl amount");
        if (amount > balance)
            throw new IllegalArgumentException("Insufficient balance");

        balance = balance - amount;

        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + balance);
    }
}



public class Bankaccount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Bank account= new Bank();
        try {
            System.out.print("Enter withdrawal amount: ");
            int amount = sc.nextInt();

            account.withdraw(amount);
        } catch (Exception e) {
             System.out.println(e.getMessage());
        }
    }
}

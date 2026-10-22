class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(){
        super("Insufficient Balance!");
    }
}
class BankAccount{
    private double balance;
    BankAccount(double balance){
        this.balance=balance;
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount>balance){
            throw new InsufficientBalanceException();
        }
        balance=balance-amount;
        System.out.println("Withdraw success");
    }
}


public class BankDemo1 {
    public static void main(String[] args){
            BankAccount account= new BankAccount(5000);
            try {
                account.withdraw(5000);
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        }
    }


interface Payment{
    void pay();
}

class CreditCard implements Payment{
    public void pay(){
        System.out.println("Payment by Credit card");
    }
}
class UPI implements  Payment{
    public void pay(){
        System.out.println("payment by UPI");
    }
}
class NetBanking implements Payment{
    public void pay(){
        System.out.println("Payment by Net Banking");
    }
}



public class PaymentDemo {
    public static void main(String[] args) {
        Payment p;
        p=new CreditCard();
        p.pay();
        p=new UPI();
        p.pay();
        p=new NetBanking();
        p.pay();    
    }
}

package model;

public class PayPalPayment implements PaymentMethod{

    @Override
    public void pay(double amount){
        System.out.println("Pagamento de R$" + amount + " realizado via paypal.");
    }
}

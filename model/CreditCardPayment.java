package model;

//SRP: CreditCardPayment tem apenas a responsabilidade de processar pagamentos com cartão de crédito.
//✔ LSP: CreditCardPayment pode substituir PaymentMethod sem modificar o comportamento esperado.
public class CreditCardPayment implements PaymentMethod{

    @Override
    public void pay(double amount){
        System.out.println("Pagamento de R$" + amount + " Realizado com sucesso!");
    }
}

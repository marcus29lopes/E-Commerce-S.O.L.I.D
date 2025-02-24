package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();
    private PaymentMethod paymentMethod;

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment() {
        if (paymentMethod == null) {
            throw new IllegalStateException("Método de pagamento não definido!");
        }
        paymentMethod.pay(getTotal());
    }

    public List<Product> getProducts() {
        return products;
    }
}

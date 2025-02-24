package service;

import model.Order;
import model.OrderRepository;
import model.PaymentMethod;

public class OrderService {
    private OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public void processOrder(Order order, PaymentMethod paymentMethod) {
        order.setPaymentMethod(paymentMethod);
        order.processPayment();
        repository.saveOrder(order);
    }
}

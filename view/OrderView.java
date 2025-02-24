package view;

import model.*;
import service.OrderService;
import service.ReportService;

public class OrderView {
    public static void main(String[] args) {
        // Criando produtos
        Product p1 = new Product("Notebook", 3500);
        Product p2 = new Product("Mouse", 150);
        Product p3 = new Product("Teclado", 250);

        // Criando pedido
        Order order = new Order();
        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);

        // Criando serviços
        OrderRepository repository = new OrderRepository();
        OrderService orderService = new OrderService(repository);
        ReportService reportService = new ReportService(repository);

        // Escolhendo pagamento e processando pedido
        PaymentMethod creditCard = new CreditCardPayment();
        orderService.processOrder(order, creditCard);

        // Gerando relatório
        reportService.generateReport();
    }
}

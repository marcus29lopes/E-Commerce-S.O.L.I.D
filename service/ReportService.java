package service;

import model.Order;
import model.OrderRepository;

public class ReportService {
    private OrderRepository repository;

    public ReportService(OrderRepository repository) {
        this.repository = repository;
    }

    public void generateReport() {
        System.out.println("\n📊 Relatório de Pedidos:");
        for (Order order : repository.getOrders()) {
            System.out.println("Pedido de R$ " + order.getTotal() + " com " + order.getProducts().size() + " produtos.");
        }
    }
}

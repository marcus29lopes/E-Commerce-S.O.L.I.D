package model;

import java.util.ArrayList;
import java.util.List;


//DIP: OrderRepository não depende diretamente de uma implementação específica (ArrayList),
// mas de uma abstração (OrderStorage), permitindo flexibilidade.
//SRP: OrderRepository tem apenas a responsabilidade de armazenar pedidos.
public class OrderRepository {
    private List<Order> orders = new ArrayList<>();

    public void saveOrder(Order order) {
        orders.add(order);
        System.out.println("Pedido salvo com sucesso!");
    }

    public List<Order> getOrders() {
        return orders;
    }
}

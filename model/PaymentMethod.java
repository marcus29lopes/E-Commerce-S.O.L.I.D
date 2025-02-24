package model;

//OCP: A interface PaymentMethod permite adicionar novos métodos de pagamento sem modificar
// código existente.

//ISP: A interface é enxuta e não força classes a implementar métodos irrelevantes.
public interface PaymentMethod {
    void pay(double amount);
}

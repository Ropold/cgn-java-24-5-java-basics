package ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    List<Order> orders;

    public OrderListRepo() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order){
        orders.remove(order);
    }

    public Order findByOrderId(int orderId) {
        for (Order order : orders) {
            if (order.orderId() == orderId) {
                return order;
            }
        }
        System.out.println("Order not exist");
        return null;
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "orders=" + orders +
                '}';
    }
}



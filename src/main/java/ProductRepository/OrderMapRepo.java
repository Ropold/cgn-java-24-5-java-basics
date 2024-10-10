package ProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepo{
    Map<Integer, Order> orders;

    public OrderMapRepo() {
        this.orders = new HashMap<>();
    }

    @Override
    public void addOrder(Order order) {
        orders.put(order.orderId(),order);
    }

    @Override
    public void removeOrder(Order order) {
        orders.remove(order.orderId());
    }

    @Override
    public Order findByOrderId(int orderId) {
        Order order = orders.get(orderId);
        if (order == null) {
            System.out.println("Order not exist");
        }
        return order;
    }

    @Override
    public List<Order> getAllOrders() {
        return new ArrayList<>(orders.values());
    }
}

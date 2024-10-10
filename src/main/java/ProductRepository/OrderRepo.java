package ProductRepository;

import java.util.List;

public interface OrderRepo {
    void addOrder(Order order);
    void removeOrder(Order order);
    Order findByOrderId(int orderId);
    List<Order> getAllOrders();
}




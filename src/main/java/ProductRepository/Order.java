package ProductRepository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public record Order(
        int orderId,
        int customerId,
        Date orderDate,
        Map<Integer, Product> orderProducts,
        double amount

) {
    public Order(int orderId, Map<Integer, Product> orderProducts, double amount) {
        this(orderId, 0, null, orderProducts, amount);
    }
}


package ProductRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopService {

    private ProductRepo productRepo;
    private OrderListRepo orderListRepo;

    public ShopService(ProductRepo productRepo, OrderListRepo orderListRepo) {
        this.productRepo = productRepo;
        this.orderListRepo = orderListRepo;
    }

    public Order placeOrder(List<Integer> productsIds) {
        int orderId = orderListRepo.getAllOrders().size() + 1;
        Map<Integer, Product> orderProducts = new HashMap<>();

        for (Integer productId : productsIds) {
            Product product = productRepo.getLegoById(productId);
            orderProducts.put(productId, product);
        }

        Order orderNew = new Order(orderId, orderProducts, 100.00);
        orderListRepo.addOrder(orderNew);
        return orderNew;
    }
}

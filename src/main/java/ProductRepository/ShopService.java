package ProductRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopService {

    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public Order placeOrder(List<Integer> productsIds) {
        int orderId = orderRepo.getAllOrders().size() + 1;
        Map<Integer, Product> orderProducts = new HashMap<>();
        boolean allProductsAvailable = true;

        for (Integer productId : productsIds) {
            Product product = productRepo.getLegoById(productId);

            if (product == null) {
                System.out.println("Lego with ID " + productId + " does not exist.");
                allProductsAvailable = false;
            } else if (!product.isAvailable()) {
                System.out.println("Lego " + product.name() + " not in stock.");
                allProductsAvailable = false;
            } else {
                orderProducts.put(productId, product);
            }
        }

        if (!allProductsAvailable){
            return null;
        }

        Order orderNew = new Order(orderId, orderProducts, 100.00);
        orderRepo.addOrder(orderNew);
        return orderNew;
    }
}

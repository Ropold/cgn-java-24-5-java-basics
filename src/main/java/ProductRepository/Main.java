package ProductRepository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

     Product CastleHogwarts = new Product(71043, "Castle Hogwarts", "School of Harry Potter",6020,469.99);
     Product MillenniumFalcon = new Product(75192, "Millennium Falcon", "Star Wars Ultimate Collector Series", 7541, 799.99);
     Product TajMahal = new Product(10256, "Taj Mahal", "Iconic Indian Landmark", 5923, 369.99);
     Product LamborghiniSian = new Product(42115, "Lamborghini Sián FKP 37", "Technic Lamborghini Supercar", 3696, 379.99);
     Product NinjagoCityGardens = new Product(71741, "Ninjago City Gardens", "Ninjago Modular City Set", 5685, 299.99);
     Product Titanic = new Product(10294, "Titanic", "Historic Ocean Liner", 9090, 679.99);

     ProductRepo legoRepo = new ProductRepo();
     legoRepo.addLego(CastleHogwarts);
     legoRepo.addLego(MillenniumFalcon);


     OrderListRepo orderListRepo1 = new OrderListRepo();
     ShopService shopService = new ShopService(legoRepo, orderListRepo1);

     List<Integer> productIds = Arrays.asList(CastleHogwarts.id(), MillenniumFalcon.id());

     Order newOrder = shopService.placeOrder(productIds);

     System.out.println(newOrder);




//     Map<Integer, Integer> orderProducts1 = new HashMap<>();
//     orderProducts1.put(CastleHogwarts.id(), 1);
//     orderProducts1.put(MillenniumFalcon.id(), 2);
//
//     Order order1 = new Order(1,orderProducts1,900.00);
//     OrderListRepo orderListRepo1 = new OrderListRepo();
//     orderListRepo1.addOrder(order1);



    }
}



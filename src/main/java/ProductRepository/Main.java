package ProductRepository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

     Product CastleHogwarts = new Product(71043, "Castle Hogwarts", "School of Harry Potter",6020,469.99,true);
     Product MillenniumFalcon = new Product(75192, "Millennium Falcon", "Star Wars Ultimate Collector Series", 7541, 799.99,true);
     Product TajMahal = new Product(10256, "Taj Mahal", "Iconic Indian Landmark", 5923, 369.99);
     Product LamborghiniSian = new Product(42115, "Lamborghini Sián FKP 37", "Technic Lamborghini Supercar", 3696, 379.99);
     Product NinjagoCityGardens = new Product(71741, "Ninjago City Gardens", "Ninjago Modular City Set", 5685, 299.99);
     Product Titanic = new Product(10294, "Titanic", "Historic Ocean Liner", 9090, 679.99);

     ProductRepo legoRepo = new ProductRepo();
     legoRepo.addLego(CastleHogwarts);
     legoRepo.addLego(MillenniumFalcon);
     legoRepo.addLego(TajMahal);

     OrderListRepo orderListRepo1 = new OrderListRepo();
     OrderMapRepo orderMapRepo1 = new OrderMapRepo();

     ShopService shopService1 = new ShopService(legoRepo, orderListRepo1);
     ShopService shopService2 = new ShopService(legoRepo, orderMapRepo1);

     List<Integer> myOrder1 = Arrays.asList(TajMahal.id(), MillenniumFalcon.id(), Titanic.id());
     List<Integer> myOrder2 = Arrays.asList(CastleHogwarts.id(),MillenniumFalcon.id());

     Order newOrder1 = shopService1.placeOrder(myOrder1);
     Order newOrder2 = shopService2.placeOrder(myOrder2);

     System.out.println(newOrder1);
     System.out.println(newOrder2);


    }
}



package ProductRepository;

import java.util.HashMap;
import java.util.Map;

public class ProductRepo {
    private final Map<Integer, Product> legos;;

    public ProductRepo() {
        legos = new HashMap<>();
    }

    public void addLego(Product product){
        legos.put(product.id(), product);
    }

    public Product getLegoById(Integer id){
        return legos.get(id);
    }

    public void removeLego(Product product){
        legos.remove(product.id(), product);
    }

    public void printAllLego(){
        for (Product product: legos.values()){
            System.out.println(product);
        }
    }


    @Override
    public String toString() {
        return "ProductRepo{" +
                "legos=" + legos +
                '}';
    }
}

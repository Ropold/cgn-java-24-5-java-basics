package ProductRepoIphone;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepo {
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public Optional<Product> getProductById(int id) {
        for (Product product : products) {
            if (product.id() == id) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    public Product addProduct(Product newProduct){
        products.add(newProduct);
        return newProduct;
    }

    public void removeProduct(int id){
        for (Product product : products) {
            if(product.id()==id){
                products.remove(product);
            }
        }
        System.out.println("not found");
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}

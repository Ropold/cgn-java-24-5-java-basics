package ProductRepoIphone;

import java.util.List;

public class ProductRepo {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id){
        for(Product product : products){
            if(product.id()==id){
                return product;
            }
        }
        System.out.println("no such id exist");
        return null;
    }

    public Product addProduct(Product newProduct){
        products.add(newProduct);
        return newProduct;
    }

    public void removeProduct(int id){
        for(Product product : products){
            if(product.id()==id){
                products.remove(product);
            }
        }
        System.out.println("cant remove, id not exist");
    }

}

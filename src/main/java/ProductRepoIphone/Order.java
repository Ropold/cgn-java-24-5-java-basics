package ProductRepoIphone;

import ProductRepository.Product;

import java.util.List;

public record Order(
        int id,
        List<Product> products
) {
}

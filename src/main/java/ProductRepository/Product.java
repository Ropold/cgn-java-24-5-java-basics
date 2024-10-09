package ProductRepository;

public record Product(
        int id,
        String name,
        String description,
        int parts,
        double price,
        boolean isAvailable
) {
    public Product(int id, String name, String description, int parts, double price) {
        this(id, name, description, parts, price, false);
    }
}

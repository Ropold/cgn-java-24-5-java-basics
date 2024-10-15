package ProductRepoIphone;

public class Main {
    public static void main(String[] args) {

        Product iphone1 = new Product(1,"X",200.00);
        Product iphone2 = new Product(2,"Xs",150.00);
        Product iphone3 = new Product(3,"16", 1199.00);

        ProductRepo iphoneRepo1 = new ProductRepo();

        iphoneRepo1.addProduct(iphone1);
        iphoneRepo1.addProduct(iphone2);
        iphoneRepo1.addProduct(iphone3);

        //System.out.println(iphoneRepo1);

        System.out.println(iphoneRepo1.getProductById(4));;

    }
}

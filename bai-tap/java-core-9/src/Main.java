import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductService p = new ProductService();
        ArrayList<Product> pp = p.getAllProduct();
        p.show(pp);
    }
}

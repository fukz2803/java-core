import java.util.ArrayList;

public class ProductService {

    public ArrayList<Product> getAllProduct() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1,"Nồi cơm điện",500000,"Đồ gia dụng",100));
        products.add(new Product(2,"Bánh bao",10000,"Thực phẩm",500));
        products.add(new Product(3,"Áo len",200000,"Thời trang",20));

        return products;
    }

    public void show (ArrayList<Product> products){
        for (Product p : products
             ) {
            System.out.println(p);
        }
    }

}

import java.util.ArrayList;
import java.util.Scanner;

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

    public Product createProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("Nhập giá bán: ");
        long price = Long.parseLong(sc.nextLine());
        System.out.println("Loại mặt hàng: ");
        String typeOfProduct = sc.nextLine();
        System.out.println("Nhập số lượng bán: ");
        int sellAmount = Integer.parseInt(sc.nextLine());

        Product newProduct = new Product(id,name,price,typeOfProduct,sellAmount);
        return newProduct;
    }

    public void addProduct(Product product, ArrayList<Product> products){
        products.add(createProduct());
    }

    public void searchByProduct(ArrayList<Product> products, String searchProduct){
        for (Product p : products
             ) {
            if (p.getName().toLowerCase().contains(searchProduct.toLowerCase())){
                System.out.println(p);
            }
        }
    }

    public void searchByType(ArrayList<Product> products, String typeOfProduct){
        for (Product p : products
             ) {
            if (p.getTypeOfProduct().toLowerCase().contains(typeOfProduct.toLowerCase())){
                System.out.println(p);
            }
        }
    }

    public Product searchById(ArrayList<Product> products, int id){
        for (Product p : products
             ) {
            if (id == p.getId()){
                return p;
            }
        }
        return null;
    }

    public void updateProduct(Product product, String newName){
        product.setName(newName);
    }

    public void updatePrice(Product product, long newPrice){
        product.setPrice(newPrice);
    }

    public void removeProduct(ArrayList<Product> products, Product product){
        products.remove(product);
    }

}

package Product;

import Product.Product;

import java.util.ArrayList;

public class ProductService {
    public ArrayList<Product> getAllProduct() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new

                Product(1, "Iphone 8 PLUS", "Điện thoại iphone", 6000000, 10, 5, "Apple", "Điện thoại, Apple"));
        products.add(new

                Product(2, "ASUS ROG Strix G15", "Laptop gaming", 30000000, 20, 15, "ASUS", "Laptop"));
        products.add(new

                Product(3, "SAMSUNG Galaxy Z Fold3", "Điện thoại Samsung", 44000000, 10, 8, "Samsung", "Điện thoại"));
        products.add(new

                Product(4, "Airpod 2", "Tai nghe không dây", 3000000, 50, 12, "Apple", "Phụ kiện, Apple"));

        return products;
    }

    public void show(ArrayList<Product> products) {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void searchByProduct(ArrayList<Product> products, String searchProduct) {
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(searchProduct.toLowerCase())) {
                System.out.println(p);
            }
        }
    }

    public void showCategory(ArrayList<Product> products, String category) {
        for (Product p : products) {
            if (p.getCategory().toLowerCase().contains(category.toLowerCase())) {
                System.out.println(p);
            }
        }
    }

    public void showManufacturer(ArrayList<Product> products, String manufacturer) {
        for (Product p : products) {
            if (p.getManufacturer().toLowerCase().contains(manufacturer.toLowerCase())) {
                System.out.println(p);
            }
        }
    }

    public void showQuantityOfCategory(ArrayList<Product> products, String category) {
        for (Product p : products) {
            if (p.getCategory().toLowerCase().contains(category.toLowerCase())) {
                System.out.println(p);
            }
        }
    }

    public void priceComparingSmaller(ArrayList<Product> products, long price) {
        for (Product p : products) {
            if (p.getPrice() < price){
                System.out.println(p);
            }
        }
    }

    public void priceComparing(ArrayList<Product> products, long price1, long price2) {
        for (Product p : products) {
            if (price1 < p.getPrice() && p.getPrice() < price2){
                System.out.println(p);
            }
        }
    }

    public void priceComparingLarger(ArrayList<Product> products, long price) {
        for (Product p : products) {
            if (p.getPrice() > price){
                System.out.println(p);
            }
        }
    }

}


package Service;

import Model.Category;
import Model.Product;
import Repo.ProductRepo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ProductService {
    public ProductRepo repo = new ProductRepo();

    public void showAll(ArrayList<Product> products) {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void getProductByCategory(Category category) {
        int count = 0;
        for (Product p : repo.getAllProduct()) {
            if (p.getCategory() == category) {
                System.out.println(p);
                count++;
            }
        }
        System.out.println("Có " + count + " sản phẩm");
        if (count == 0) {
            System.out.println("Không có sản phẩm nào.");
        }
    }

//    public void sortCategoryByPriceHTL(Category category){
//        int count = 0;
//        ArrayList<Product> sortCategory = new ArrayList<>();
//        for (Product p : repo.getAllProduct()) {
//            if (p.getCategory() == category) {
//                sortCategory.add(p);
//
//                System.out.println(sortCategory);
//                count++;
//            }
//        }
//        System.out.println("Có " + count + " sản phẩm");
//        if (count == 0) {
//            System.out.println("Không có sản phẩm nào.");
//        }
//    }

    public void getProductByBrand(String brand) {
        int count = 0;
        for (Product p : repo.getAllProduct()) {
            if (p.getBrand().equalsIgnoreCase(brand)) {
                System.out.println(p);
                count++;
            }
        }
        System.out.println("Có " + count + " sản phẩm");
        if (count == 0) {
            System.out.println("Không có sản phẩm nào.");
        }
    }

    public void getProductByPrice(int choose) {
        int count = 0;
        switch (choose) {
            case 1:
                for (Product p : repo.getAllProduct()) {
                    if (p.getPrice() < 2000000) {
                        System.out.println(p);
                        count++;
                    }
                }
                System.out.println("Có " + count + " sản phẩm");
                if (count == 0) {
                    System.out.println("Không có sản phẩm nào.");
                }
                break;
            case 2:
                for (Product p : repo.getAllProduct()) {
                    if (p.getPrice() >= 2000000 && p.getPrice() < 4000000) {
                        System.out.println(p);
                        count++;
                    }
                }
                System.out.println("Có " + count + " sản phẩm");
                if (count == 0) {
                    System.out.println("Không có sản phẩm nào.");
                }
                break;
            case 3:
                for (Product p : repo.getAllProduct()) {
                    if (p.getPrice() >= 4000000 && p.getPrice() < 7000000) {
                        System.out.println(p);
                        count++;
                    }
                }
                System.out.println("Có " + count + " sản phẩm");
                if (count == 0) {
                    System.out.println("Không có sản phẩm nào.");
                }
                break;
            case 4:
                for (Product p : repo.getAllProduct()) {
                    if (p.getPrice() >= 7000000 && p.getPrice() < 13000000) {
                        System.out.println(p);
                        count++;
                    }
                }
                System.out.println("Có " + count + " sản phẩm");
                if (count == 0) {
                    System.out.println("Không có sản phẩm nào.");
                }
                break;
            case 5:
                for (Product p : repo.getAllProduct()) {
                    if (p.getPrice() >= 13000000) {
                        System.out.println(p);
                        count++;
                    }
                }
                System.out.println("Có " + count + " sản phẩm");
                if (count == 0) {
                    System.out.println("Không có sản phẩm nào.");
                }
                break;
            default:
                System.out.println("Không có lựa chọn này");
                break;
        }
        if (count == 0) {
            System.out.println("Không có sản phẩm nào");
        }
    }

    public void searchProductByName(String name) {
        int count = 0;
        for (Product p : repo.getAllProduct()) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(p);
                count++;
            }
        }
        System.out.println("Có " + count + " sản phẩm");
        if (count == 0) {
            System.out.println("Không có sản phẩm nào.");
        }
    }

    public Product searchById(int id) {
        for (Product p : repo.getAllProduct()) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

}

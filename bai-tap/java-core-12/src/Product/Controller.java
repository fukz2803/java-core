package Product;

import java.util.ArrayList;
import java.util.Scanner;

import static Product.Menu.*;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static ProductService service = new ProductService();
    static ArrayList<Product> products = service.getAllProduct();



    public static void mainMenu(){
        boolean isContinue = true;

        while (isContinue){
            home();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    subCategoryMenu();
                    break;
                case 2:
                    subManufacturerMenu();
                    break;
                case 3:
                    priceMenu();
                    break;
                case 4:
                    System.out.println("Tìm theo tên sản phẩm");
                    String name = sc.nextLine();
                    service.searchByProduct(products,name);
                    break;
                case 5:
                    subQuantityOfCategory();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }



    public static void subCategoryMenu(){
        boolean isContinue = true;

        while (isContinue){
            subCategory();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    service.showCategory(products,"Điện thoại");
                    break;
                case 2:
                    service.showCategory(products,"Laptop");
                    break;
                case 3:
                    service.showCategory(products,"Apple");
                    break;
                case 4:
                    service.showCategory(products,"Phụ kiện");
                    break;
                case 0:
                    mainMenu();
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }



    public static void subManufacturerMenu(){
        boolean isContinue = true;

        while (isContinue){
            subManufacturer();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    service.showManufacturer(products,"Apple");
                    break;
                case 2:
                    service.showManufacturer(products,"ASUS");
                    break;
                case 3:
                    service.showManufacturer(products,"SAMSUNG");
                    break;
                case 0:
                    mainMenu();
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }


    public static void subQuantityOfCategory(){
        boolean isContinue = true;

        while (isContinue){
            subCategory();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    service.showQuantityOfCategory(products,"Điện thoại");
                    break;
                case 2:
                    service.showQuantityOfCategory(products,"Laptop");
                    break;
                case 3:
                    service.showQuantityOfCategory(products,"Apple");
                    break;
                case 4:
                    service.showQuantityOfCategory(products,"Phụ kiện");
                    break;
                case 0:
                    mainMenu();
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }



    public static void priceMenu(){
        boolean isContinue = true;

        while (isContinue){
            subPrice();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    service.priceComparingSmaller(products,2000000);
                    break;
                case 2:
                    service.priceComparing(products,2000000,4000000);
                    break;
                case 3:
                    service.priceComparing(products,4000000,7000000);
                    break;
                case 4:
                    service.priceComparing(products,7000000,13000000);
                    break;
                case 5:
                    service.priceComparingSmaller(products,13000000);
                    break;
                case 0:
                    mainMenu();
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

}

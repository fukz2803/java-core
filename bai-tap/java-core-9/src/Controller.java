import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static ProductService service = new ProductService();
    static ArrayList<Product> products = service.getAllProduct();

    public static void menu(){
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Xem toàn bộ sản phẩm");
        System.out.println("[2] - Thêm sản phẩm");
        System.out.println("[3] - Tìm theo tên sản phẩm");
        System.out.println("[4] - Tìm theo loại mặt hàng");
        System.out.println("[5] - Sửa sản phẩm");
        System.out.println("[0] - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void mainMenu(){
        boolean isContinue = true;

        while (isContinue){
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Danh sách: ");
                    service.show(products);
                    break;
                case 2:
                    System.out.println("Thêm sản phẩm: ");
                    Product newBook = service.createProduct();
                    service.addProduct(newBook,products);
                    break;
                case 3:
                    System.out.println("Tìm theo tên sản phẩm");
                    String name = sc.nextLine();
                    service.searchByProduct(products,name);
                    break;
                case 4:
                    System.out.println("Tìm theo loại mặt hàng");
                    String type = sc.nextLine();
                    service.searchByType(products,type);
                    break;
                case 5:
                    System.out.println("Sửa sản phẩm");
                    searhById();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void submenu(){
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Sửa tên sản phẩm");
        System.out.println("[2] - Sửa giá sản phẩm");
        System.out.println("[3] - Xóa sản phẩm");
        System.out.println("[4] - Quay về màn hình chính");
        System.out.println("Lựa chọn của bạn là");
    }

    public static void searhById() {
        System.out.println("Nhập id sản phẩm muốn sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        Product product = service.searchById(products, id);
        System.out.println(product);

        submenu();
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Nhập tên mới: ");
                String newTitle = sc.nextLine();
                service.updateProduct(product, newTitle);
                break;
            case 2:
                System.out.println("Nhập tên mới: ");
                long newPrice = Long.parseLong(sc.nextLine());
                service.updatePrice(product, newPrice);
                break;
            case 3:
                System.out.println("Danh sách sau khi xóa: ");
                service.removeProduct(products, product);
                service.show(products);
                break;
            case 4:
                menu();
                break;
        }
    }
}

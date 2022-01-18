package Product;

public class Menu {
    public static void home(){
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Xem sản phẩm theo danh mục");
        System.out.println("[2] - Xem sản phẩm theo hãng sản xuất");
        System.out.println("[3] - Xem sản phẩm theo giá bán");
        System.out.println("[4] - Tìm tên sản phẩm");
        System.out.println("[5] - Xem số lượng sản phẩm theo danh mục");
        System.out.println("[0] - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void subCategory(){
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Điện thoại");
        System.out.println("[2] - Laptop");
        System.out.println("[3] - Apple");
        System.out.println("[4] - Phụ kiện");
        System.out.println("[0] - Quay về menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void subManufacturer(){
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Apple");
        System.out.println("[2] - ASUS");
        System.out.println("[3] - SAMSUNG");
        System.out.println("[0] - Quay về menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void subPrice(){
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Dưới 2 triệu");
        System.out.println("[2] - Từ 2 - 4 triệu");
        System.out.println("[3] - Từ 4 - 7 triệu");
        System.out.println("[4] - Từ 7 - 13 triệu");
        System.out.println("[5] - Trên 13 triệu");
        System.out.println("[0] - Quay về menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }
}

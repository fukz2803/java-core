package Menu;

public class Menu {
    public static void home() {
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Xem toàn bộ sản phẩm");
        System.out.println("[2] - Xem sản phẩm theo danh mục");
        System.out.println("[3] - Xem sản phẩm theo hãng sản xuất");
        System.out.println("[4] - Xem sản phẩm theo mức giá");
        System.out.println("[5] - Tìm kiếm sản phẩm theo tên");
        System.out.println("[6] - Đăng nhập");
        System.out.println("[7] - Đăng ký");
        System.out.println("[0] - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void menuCategory() {
        System.out.println("-----------------------------------------");
        System.out.println("[1] - CPU - Bộ xử lý");
        System.out.println("[2] - Mainboard - Bo mạch chủ");
        System.out.println("[3] - RAM - Bộ nhớ RAM");
        System.out.println("[4] - VGA - Card màn hình");
        System.out.println("[5] - Case - Thùng máy");
        System.out.println("[6] - PSU - Bộ nguồn máy tính");
        System.out.println("[0] - Về menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void menuPrice() {
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Dưới 2.000.000đ");
        System.out.println("[2] - Từ 2.000.000đ đến 4.000.000đ");
        System.out.println("[3] - Từ 4.000.000đ đến 7.000.000đ");
        System.out.println("[4] - Từ 7.000.000đ đến 13.000.000đ");
        System.out.println("[5] - Trên 13.000.000đ");
        System.out.println("[0] - Về menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void loginSuccessMenu(){
        System.out.println("1 - Thay đổi username");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi mật khẩu");
        System.out.println("4 - Thêm hàng vào giỏ");
        System.out.println("5 - Xem giỏ hàng");
        System.out.println("6 - Đăng xuất");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void loginFailMenu(){
        System.out.println("1 - Đăng nhập lại");
        System.out.println("2 - Quên mật khẩu");
        System.out.println("Lựa chọn của bạn là: ");
    }
}

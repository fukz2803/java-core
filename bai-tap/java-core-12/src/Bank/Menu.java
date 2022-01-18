package Bank;

public class Menu {
    public static void home(){
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Đăng nhập");
        System.out.println("[0] - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void mainLogin(){
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Truy vấn số dư tài khoản");
        System.out.println("[2] - Chuyển tiền");
        System.out.println("[3] - Xem lịch sử giao dịch");
        System.out.println("[0] - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void bankList(){
        System.out.println("-----------------------------------------");
        System.out.println("Danh sách ngân hàng");
        System.out.println("[1] - Techcombank");
        System.out.println("[2] - Agribank");
        System.out.println("[3] - Vietcombank");
        System.out.println("[0] - Quay lại menu");
        System.out.println("Lựa chọn của bạn là: ");
    }
}

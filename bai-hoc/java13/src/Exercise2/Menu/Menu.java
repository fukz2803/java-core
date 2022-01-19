package Exercise2.Menu;

public class Menu {
    public static void menu(){
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Xem danh sách từng loại sách báo");
        System.out.println("[2] - Tìm theo tên");
        System.out.println("[3] - Tìm theo thể loại");
        System.out.println("[4] - Xem Ebook có nhiều lượt tải nhất");
        System.out.println("[5] - Các báo phát hành trong năm nay");
        System.out.println("[0] - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void menuSub(){
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Xem danh sách sách giáo khoa");
        System.out.println("[2] - Xem danh sách báo");
        System.out.println("[3] - Xem danh sách Ebook");
        System.out.println("[0] - Về menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }
}

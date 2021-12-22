import java.util.Scanner;

public class ScannerPt {
    public static void phuongTrinh(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Giải phương trình bậc nhất một ẩn ax + b = 0, ta có: ");
        System.out.println("Nhập biến a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập biến b: ");
        double b = sc.nextDouble();

        double x = -b/a;

        System.out.println("Vậy x bằng: " +x);
    }

}

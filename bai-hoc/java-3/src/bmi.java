import java.util.Scanner;

public class bmi {
    public static void bmiCheck(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap can nang: ");
        double canNang = sc.nextDouble();
        System.out.println("Nhap chieu cao: ");
        double chieuCao = sc.nextDouble();

        double bmi = canNang / (chieuCao * chieuCao);

        if (bmi <= 18.5) {
            System.out.println("Bạn gầy!");
        } else if (18.5 < bmi && bmi <= 24.9) {
            System.out.println("Bạn cân đối");
        } else {
            System.out.println("Bạn là Đuông dừa");
        }
    }
}

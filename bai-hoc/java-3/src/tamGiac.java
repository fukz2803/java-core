import java.util.Scanner;

public class tamGiac {
    public static void tamGiacCheck() {
    Scanner tamGiac1 = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
    double a = tamGiac1.nextDouble();
        System.out.println("Nhap canh b: ");
    double b = tamGiac1.nextDouble();
        System.out.println("Nhap canh c: ");
    double c = tamGiac1.nextDouble();

        if (a+b>c && a+c>b && b+c>a) {
        System.out.println("La tam giac");
    }
        else {
        System.out.println("khong phai tam giac");
    }
    }
}

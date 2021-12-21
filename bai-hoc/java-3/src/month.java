import java.util.Scanner;

public class month {
    public static void monthCheck(){
        Scanner thangCheck = new Scanner(System.in);
        System.out.println("Nhap thang de kiem tra: ");
        int thang = thangCheck.nextInt();

        switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Thang nay co 31 ngay");
                break;
            case 2:
                System.out.println("Thang nay co 28 hoac 29 ngay");
                break;
            case 4, 6, 9, 11:
                System.out.println("Thang nay co 30 ngay");
                break;
            default:
                System.out.println("Khong co thang nay");
        }
    }
}

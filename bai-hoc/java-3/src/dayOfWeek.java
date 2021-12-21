import java.util.Scanner;

public class dayOfWeek {
    public static void dayOfWeekCheck(){
        Scanner test1 = new Scanner(System.in);
        System.out.println("Nhap so bat ki: ");
        int num = test1.nextInt();

        switch (num) {
            case 2:
                System.out.println("Thu 2");
                break;
            case 3:
                System.out.println("Thu 3");
                break;
            case 4:
                System.out.println("Thu 4");
                break;
            case 5:
                System.out.println("Thu 5");
                break;
            case 6:
                System.out.println("Thu 6");
                break;
            case 7:
                System.out.println("Thu 7");
                break;
            case 8:
                System.out.println("Chu Nhat");
                break;
            default:
                System.out.println("Khong co ngay nay trong tuan");
        }
    }
}

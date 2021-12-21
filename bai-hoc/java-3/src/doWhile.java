import java.util.Random;
import java.util.Scanner;

public class doWhile {
    public static void doWhileCheck() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();


//        Lam lai
//        double canNang = 0;
//        double chieuCao = 0;
//        double bmi = canNang/(chieuCao*chieuCao);
//        do {
//            System.out.println("Nhap can nang: ");
//            canNang = sc.nextInt();
//            System.out.println("Nhap chieu cao: ");
//            chieuCao = sc.nextInt();
//
//        }
//        while(canNang >1 && canNang <100 && chieuCao > 1 && chieuCao < 2.5);
//        System.out.println(bmi);


        boolean isContinue = true;

        while (isContinue){
            System.out.println("Doan so: ");
            int number = sc.nextInt();
            int rdNumber = rd.nextInt(100);

            if (number == rdNumber) {
                System.out.println("Ban doan dung roi");
                System.out.println("So ngau nhien la " + rdNumber);
                isContinue = false;
            }

            else if (number < rdNumber) {
                System.out.println("So ban doan lon hon");
                System.out.println("So ngau nhien la " + rdNumber);
            }

            else {
                System.out.println("So ban doan nho hon");
                System.out.println("So ngau nhien la " + rdNumber);
            }
        }


    }
}

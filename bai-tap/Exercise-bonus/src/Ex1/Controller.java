package Ex1;

import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);


    public static void primeCheck() {
        boolean isContinue = true;

        while (isContinue) {
            System.out.println("Nhập số nguyên bất kì để kiểm tra: ");
            int number = Integer.parseInt(sc.nextLine());
            if (Prime.isPrimeNumber(number) == true){
                System.out.println(number + " là số nguyên tố.");
            }else {
                System.out.println(number + " không phải số nguyên tố.");
            }
            String exitProgram = sc.nextLine();
            if (exitProgram.toLowerCase().equals("q")){
                System.exit(0);
            }
        }
    }
}

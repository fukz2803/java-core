import java.util.Random;
import java.util.StringTokenizer;

public class Loop {
    public static void strCount() {
        String str = "You only live once, but if you do it right, once is enough";
        int count = 0;
        char kyTu = 'o';

        System.out.println("Chữ 'o' xuất hiện ở các vị trí: ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
                System.out.printf(str.indexOf(kyTu, i) + "\t");
            }
        }
        System.out.println();

        System.out.println("Số lần chữ 'o' xuất hiện trong chuỗi là: " + count);

        StringTokenizer strToken = new StringTokenizer(str);
        int wordsCount = strToken.countTokens();
        System.out.println("Số từ có trong chuỗi là: " + wordsCount);
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void randomNumber() {
        Random rd = new Random();
        int rdNumber = rd.nextInt();

        System.out.println("Số ngẫu nhiên là: " + rdNumber);
        if (isPrimeNumber(rdNumber) == true) {
            System.out.println("Số " + rdNumber + " là số nguyên tố.");
        } else {
            System.out.println("Số " + rdNumber + " không phải số nguyên tố.");
        }
    }

    public static void tenNumbers(){
        System.out.println("Số nguyên tố nhỏ hơn 10 là: ");

        for (int i = 0; i < 10; i++){
            if (isPrimeNumber(i)){
                System.out.printf(i+ "\t");
            }
        }

        System.out.println();
        System.out.println("Mười số nguyên tố đầu tiên là: ");

        for (int i = 0; i < 10 ;i++){


        }
    }

}

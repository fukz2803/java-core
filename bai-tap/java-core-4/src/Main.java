import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = Array.inputArray();

        System.out.println("Mang vua tao la: ");

        Array.printArray(arr);



        int count = 0;
        System.out.println("Nhap phan tu can kiem tra so lan xuat hien: ");
        int number = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                count++;
            }
        }
        System.out.println("Phan tu " + number + " co so lan lap = " + count);

        String[] arrStr = Array.strArray();
        System.out.println("Mang chuoi vua tao la: ");
        Array.printStrArray(arrStr);

        System.out.println("Nhap chuoi can kiem tra vi tri: ");
        String str = sc.next();
        for (int i = 0; i < arrStr.length; i++){
            if (str.equals(arrStr[i])){
                System.out.println("Vi tri cua chuoi trong mang la: " + i);
            }
        }
    }
}

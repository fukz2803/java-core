import java.util.Scanner;

public class Array {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

//    public static void count(){
//        Scanner sc = new Scanner(System.in);
////        int[] arr = inputArray();
//        int count = 0;
//        System.out.println("Nhap phan tu can kiem tra so lan xuat hien: ");
//        int number = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            if (Array.inputArray[i] == number){
//                count++;
//            }
//        }
//        System.out.println("Phan tu " + number + "co so lan lap = " + count);
//    }

    public static String[] strArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu arr[%d]: ", i);
            arr[i] = sc.next();
        }
        return arr;
    }

    public static void printStrArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}


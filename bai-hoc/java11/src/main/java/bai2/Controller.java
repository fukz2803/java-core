package bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static PersonService service = new PersonService();
    static ArrayList<Person> persons = service.getAllPerson();


    public static void menu() {
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Đăng nhập");
        System.out.println("[2] - Đăng ký");
        System.out.println("[0] - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void mainMenu() {
        boolean isContinue = true;

        while (isContinue) {
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    logIn();
                    break;
//                case 2:
//                    System.out.println("Thêm sản phẩm: ");
//                    Product newBook = service.createProduct();
//                    service.addProduct(newBook,products);
//                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }


    public static void logIn() {
        String guessUsername, guessPassword;
        do {
            System.out.println("Nhập vào username: ");
            guessUsername = sc.nextLine();
            System.out.println("Nhập vào password: ");
            guessPassword = sc.nextLine();

        } while (guessPassword.equals());

    }

    public static void subMenu(){
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Thay đổi username");
        System.out.println("[2] - Thay đổi email");
        System.out.println("[3] - Thay đổi mật khẩu");
        System.out.println("[4] - Đăng xuất");
        System.out.println("[0] - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }



    public static void passSubMenu(){
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Đăng nhập lại");
        System.out.println("[2] - Quên mật khẩu");
        System.out.println("[0] - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

//    public static void passMenu(){
//        boolean isContinue = true;
//
//        while (isContinue) {
//            passSubMenu();
//            int choice = Integer.parseInt(sc.nextLine());
//            switch (choice) {
//                case 1:
//                    logIn();
//                    break;
//                case 2:
//                    forgotPass();
//                    break;
//                case 0:
//                    System.exit(0);
//                default:
//                    System.out.println("Không có lựa chọn này");
//    }




}

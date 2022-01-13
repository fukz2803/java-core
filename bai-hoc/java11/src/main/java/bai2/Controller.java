//package bai2;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Controller {
//    static Scanner sc = new Scanner(System.in);
//    static PersonService service = new PersonService();
//    static ArrayList<Person> person = service.getAllPerson();
//
//    public static void menu(){
//        System.out.println("-----------------------------------------");
//        System.out.println("[1] - Đăng nhập");
//        System.out.println("[2] - Đăng ký");
//        System.out.println("[0] - Thoát chương trình");
//        System.out.println("Lựa chọn của bạn là: ");
//    }
//
//    public static void mainMenu(){
//        boolean isContinue = true;
//
//        while (isContinue){
//            menu();
//            int choice = Integer.parseInt(sc.nextLine());
//            switch (choice){
//                case 1:
//                    checkUserPass();
//                    break;
//                case 2:
//                    System.out.println("Thêm sản phẩm: ");
//                    Product newBook = service.createProduct();
//                    service.addProduct(newBook,products);
//                    break;
//
//                case 0:
//                    System.exit(0);
//                default:
//                    System.out.println("Không có lựa chọn này");
//            }
//        }
//    }
//
//    public static void checkUserPass(String guessUsername, String guessPassword, Person person){
//        do {
//            System.out.println("Nhập user name");
//            guessUsername = sc.nextLine();
//            System.out.println("Nhập password");
//            guessPassword = sc.nextLine();
//        } while ((guessUsername != person.getUsername()) || guessPassword != person.getPassword());
//        System.out.println("Chào mừng " + guessUsername);
//    }
//
//}

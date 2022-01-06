package Controller;

import Model.Book;
import Service.BookService;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static BookService service = new BookService();
    static ArrayList<Book> books = service.getAllBook();

    public static void menu(){
        System.out.println("-----------------------------------------");
        System.out.println("1 - Xem toan bo sach");
        System.out.println("2 - Them 1 sach");
        System.out.println("3 - Tim sach theo ten");
        System.out.println("4 - Tim sach theo id");
        System.out.println("0 - Thoat chuong trinh");
        System.out.println("Lua chon cua ban la: ");
    }

    public static void mainMenu(){
        boolean isContinue = true;

        while (isContinue){
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Danh sach: ");
                    service.show(books);
                    break;
                case 2:
                    System.out.println("Them sach: ");
                    Book newBook = service.createNewBook();
                    service.addNewBook(newBook,books);
                    break;
                case 3:
                    System.out.println("Tim theo ten");
                    String title = sc.nextLine();
                    service.searchByTitle(books,title);
                    break;
                case 4:
                    System.out.println("Tim theo id");
                    searchById();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Khong co lua chon nay");
            }
        }
    }

    public static void submenu(){
        System.out.println("-----------------------------------------");
        System.out.println("1 - Sửa tên sách");
        System.out.println("2 - Xóa sách");
        System.out.println("3 - Quay về màn hình chính");
        System.out.println("Lựa chọn của bạn là");
    }

    public static void searchById(){
        System.out.println("Nhap id muon tim: ");
        int id = Integer.parseInt(sc.nextLine());
        Book book = service.searchById(books,id);
        System.out.println(book);

        submenu();
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose){
            case 1:
                System.out.println("Nhap ten moi: ");
                String newTitle = sc.nextLine();
                service.updateBook(book,newTitle);
                break;
            case 2:
                System.out.println("Danh sach sau khi xoa: ");
                service.removeBook(books,book);
                service.show(books);
                break;
            case 3:
                menu();
                break;
        }
    }

}

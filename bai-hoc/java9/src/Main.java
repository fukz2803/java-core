import Controller.Controller;
import Model.Book;
import Service.BookService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

////        Can 1 doi tuong dai dien cho class de hoat dong o main
//        BookService service = new BookService();
//
////        Can 1 bien de nhan toan bo gia tri cua phuong thuc
//        ArrayList<Book> books = service.getAllBook();
//        service.show(books);
//        System.out.println("Danh sach can tim");
//        service.searchByTitle(books,"de men");
//
//
//        Book updateBook = service.searchById(books,2);
//        service.updateBook(updateBook,"Nha gia kim");
//
//
//        System.out.println("Danh sach sau khi sua");
//        service.show(books);
//
//
//        service.removeBook(books,updateBook);
//        System.out.println("Danh sach sau khi xoa");
//        service.show(books);
//
//
//        Book newBook = service.createNewBook();
//        service.addNewBook(newBook,books);


        Controller.mainMenu();
    }

}

package Service;

import Model.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookService {

    public ArrayList<Book> getAllBook(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1,"De men phieu luu ky","To Hoai","Phieu luu"));
        books.add(new Book(2,"Doraemon","Fujiko","Phieu luu"));
        books.add(new Book(3,"Tat den","Ngo Tat To","Van hoc"));
        books.add(new Book(4,"Moon","Jesky","Trinh tham"));

        return books;
    }

    public void show(ArrayList<Book> books){
        for (Book b : books
             ) {
            System.out.println(b + "\t");
        }
    }

    public void searchByTitle(ArrayList<Book> books, String searchTitle){
        for (Book b : books
             ) {
            if (b.getTitle().toLowerCase().contains(searchTitle.toLowerCase())){
                System.out.println(b);
            }
        }
    }

    public Book searchById(ArrayList<Book> books,int id){
        for (Book b : books
             ) {
            if (b.getId() == id){
                return b;
            }
        }
        return null;
    }

    public void updateBook(Book book, String newTitle){
        book.setTitle(newTitle);
    }

    public void removeBook(ArrayList<Book> books,Book book){
        books.remove(book);
    }

    public Book createNewBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap tieu de: ");
        String title = sc.nextLine();
        System.out.println("Nhap ten tac gia: ");
        String author = sc.nextLine();
        System.out.println("Nhap the loai: ");
        String gender = sc.nextLine();

        Book newBook = new Book(id,title,author,gender);

        return newBook;
    }

    public void addNewBook(Book book, ArrayList<Book> books){
        books.add(createNewBook());
    }

}

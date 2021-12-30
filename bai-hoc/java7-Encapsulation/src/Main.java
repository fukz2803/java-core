public class Main {
    public static void main(String[] args) {
//    service.PersonService.createPerson();
//    CarService.createCar();

        Book[] books = BookService.getAllBook();
        System.out.println("Danh sách:");
        BookService.printBook(books);

        System.out.println("Sách có thể loại phiêu lưu: ");
        BookService.getBookByCategory(books, "Phiêu lưu");

        System.out.println("Tìm sách theo tên: ");
        BookService.getBookByTitle(books,"Cuốn theo");

    }
}

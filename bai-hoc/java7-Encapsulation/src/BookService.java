import java.util.Arrays;

public class BookService {
    public static Book[] getAllBook(){
        Book [] books = new Book[3];

        String [] category = new String[]{"Tình cảm","Kinh dị","Trinh thám"};
        books[0] = new Book(1,"Cuốn theo chiều gió", category,"John",1929,"XyzXXX" );
        books[1] = new Book(1,"Cô văn Nan", new String[]{"Phiêu lưu", "Viễn tưởng","Tình cảm"},"John",1929,"XyzXXX" );
        books[2] = new Book(1,"Cô văn Nan", new String[]{"Phiêu lưu", "Viễn tưởng"},"John",1929,"XyzXXX" );


        for (Book bienIn: books) {
//            System.out.println(bienIn);
            for (String a : bienIn.getCategory()) {
//                System.out.println(a);
                if (a.contains("Kinh dị")){
                    System.out.println(bienIn);
                }
            }
        }
        return books;

    }

    public static void printBook (Book[] arrBooks){
        for (Book book : arrBooks
             ) {
            System.out.println(book);
        }
    }

    public static void getBookByCategory(Book[] books, String category){
//        for (Book b : books
//        ) {
//            if (Arrays.toString(b.getCategory()).contains(category)){
//                System.out.println(b);
//            }
//        }

        for (Book b : books
             ) {
            for (String a : b.getCategory()
                 ) {
                if (a.contains(category)){
                    System.out.println(a);
                }
            }
        }
    }

    public static void getBookByTitle(Book[] books, String title){
        for (Book b : books
             ) {
            if (b.getTitle().contains(title)){
                System.out.println(b);
            }
        }
    }


}

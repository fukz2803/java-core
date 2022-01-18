package Exercise2;

import java.util.ArrayList;

public class TextBookService {

    public ArrayList<TextBook> getAllTextBook() {
        ArrayList<TextBook> textBook = new ArrayList<>();
        textBook.add(new TextBook(1, "Conan", "Trinh thám, Phiêu lưu, Kinh dị", "Kim Đồng", 2000, 5000, 2000, "Aoyama Gōshō"));
        textBook.add(new TextBook(2, "Da Vinci Code", "Trinh thám, Phiêu lưu", "Đồng Kim", 2003, 10000, 489, "Dan Brown"));
        textBook.add(new TextBook(3, "Angels and Demons", "Khoa học giả tưởng", "ÁdkjKẠ", 2001, 111000, 616, "Dan Brown"));
        textBook.add(new TextBook(4, "Toán 5", "Sách giáo khoa", "NXB Giáo dục Việt Nam", 2021, 111000, 100, "Đỗ Đình Hoan"));

        return textBook;
    }




}

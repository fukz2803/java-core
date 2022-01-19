package Exercise2.Service;

import Exercise2.Model.Ebook;

import java.util.ArrayList;

public class EbookService {

    public ArrayList<Ebook> getAllEbook() {
        ArrayList<Ebook> ebooks = new ArrayList<>();

        ebooks.add(new Ebook(1, "Hãy trả lời em tại sao?", new String[]{"Khoa học", "Kỹ thuật"}, "NXB Trẻ", 2015, 5.7, "https://img", 5000));
        ebooks.add(new Ebook(2, "Ăn mày dĩ vãng", new String[]{"Văn học"}, "NXB Văn Học", 2003, 2, "https://img", 1271));

        return ebooks;
    }

}

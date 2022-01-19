package Exercise2.Service;

import Exercise2.Model.BookModel;
import Exercise2.Model.Ebook;
import Exercise2.Model.NewSpaper;
import Exercise2.Model.TextBook;

import java.time.Year;
import java.util.*;

public class Service {
    public ArrayList<BookModel> getAllBook(){
        TextBookService textBookService = new TextBookService();
        NewSpaperService newSpaperService = new NewSpaperService();
        EbookService ebookService = new EbookService();
        ArrayList<BookModel> books = new ArrayList<>();

        ArrayList<TextBook> textBooks = textBookService.getAllTextBook();
        ArrayList<NewSpaper> newSpapers = newSpaperService.getAllNewSpaper();
        ArrayList<Ebook> ebooks = ebookService.getAllEbook();
        books.addAll(textBooks);
        books.addAll(newSpapers);
        books.addAll(ebooks);

        return books;

    }


    public void show(ArrayList<?> list){
        for (Object o : list
        ) {
            System.out.println(o);
        }
    }

    public void searchByTitle(ArrayList<BookModel> bookModels, String title){
        for (BookModel b : bookModels
             ) {
            if (b.getName().toLowerCase().contains(title.toLowerCase())){
                System.out.println(b);
            }
        }
    }

    public void searchByCategory(ArrayList<BookModel> bookModels, String category){
        for (BookModel b: bookModels
             ) {
            if (Arrays.toString(b.getCategory()).toLowerCase().contains(category.toLowerCase())){
                System.out.println(b);
            }
        }
    }

    public void highestView(ArrayList<Ebook> ebooks){
        Collections.sort(ebooks, new Comparator<Ebook>() {
            @Override
            public int compare(Ebook o1, Ebook o2) {
                return Math.toIntExact(o2.getDownloads() - o1.getDownloads());
            }
        });
        System.out.println(ebooks.get(0));
    }

    public void searchCurrentYear(ArrayList<NewSpaper> newSpapers){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        for (NewSpaper n : newSpapers
             ) {
            if (year == n.getDate().getYear()){
                System.out.println(n);
            }
        }
    }



}

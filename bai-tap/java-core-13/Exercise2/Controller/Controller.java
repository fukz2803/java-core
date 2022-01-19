package Exercise2.Controller;

import Exercise2.Model.BookModel;
import Exercise2.Model.Ebook;
import Exercise2.Model.NewSpaper;
import Exercise2.Model.TextBook;
import Exercise2.Service.EbookService;
import Exercise2.Service.NewSpaperService;
import Exercise2.Service.Service;
import Exercise2.Service.TextBookService;

import java.util.ArrayList;
import java.util.Scanner;

import static Exercise2.Menu.Menu.*;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static Service service = new Service();
    static ArrayList<BookModel> bookModels = service.getAllBook();
    static TextBookService textBookService = new TextBookService();
    static NewSpaperService newSpaperService = new NewSpaperService();
    static EbookService ebookService = new EbookService();
    static ArrayList<TextBook> textBooks = textBookService.getAllTextBook();
    static ArrayList<NewSpaper> newSpapers = newSpaperService.getAllNewSpaper();
    static ArrayList<Ebook> ebooks = ebookService.getAllEbook();


    public static void mainMenu(){
        boolean isContinue = true;

        while (isContinue){
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    subMenu();
                    break;
                case 2:
                    System.out.println("Tìm theo tên");
                    String title = sc.nextLine();
                    service.searchByTitle(bookModels,title);
                    break;
                case 3:
                    System.out.println("Tìm theo thể loại phim");
                    String category = sc.nextLine();
                    service.searchByCategory(bookModels,category);
                    break;
                case 4:
                    System.out.println("Ebook có lượng tải nhiều nhất: ");
                    service.highestView(ebooks);
                    break;
                case 5:
                    System.out.println("Những tờ báo xuất bản trong năm nay: ");
                    service.searchCurrentYear(newSpapers);
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }


    public static void subMenu(){
        boolean isContinue = true;

        while (isContinue){
            menuSub();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    service.show(textBooks);
                    break;
                case 2:
                    service.show(newSpapers);
                    break;
                case 3:
                   service.show(ebooks);
                    break;
                case 0:
                    mainMenu();
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }


}

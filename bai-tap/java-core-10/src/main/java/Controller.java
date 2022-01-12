import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static MovieService service = new MovieService();
    static ArrayList<Movie> movies = service.getAllMovie();

    public static void menu(){
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Xem danh sách phim");
        System.out.println("[2] - Tìm theo tên phim");
        System.out.println("[3] - Tìm theo thể loại phim");
        System.out.println("[4] - Sắp xếp phim theo năm xuất bản");
        System.out.println("[5] - Sắp xếp phim theo tên");
        System.out.println("[6] - Ba bộ phim có lượt xem cao nhất");
        System.out.println("[0] - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void mainMenu(){
        boolean isContinue = true;

        while (isContinue){
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Danh sách: ");
                    service.show(movies);
                    break;
                case 2:
                    System.out.println("Tìm theo tên phim");
                    String title = sc.nextLine();
                    service.searchByTitle(movies,title);
                    break;
                case 3:
                    System.out.println("Tìm theo thể loại phim");
                    String category = sc.nextLine();
                    service.searchByCategory(movies,category);
                    break;
                case 4:
                    System.out.println("Sắp xếp phim theo năm xuất bản");
                    service.sortByYear(movies);
                    break;
                case 5:
                    System.out.println("Sắp xếp phim theo tên");
                    service.sortByTitle(movies);
                    break;
                case 6:
                    System.out.println("Ba bộ phim có lượt xem cao nhất");
                    service.searchHighestView(movies);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        FilmService service = new FilmService();
        ArrayList<Film> films = service.getAllFilms();

        service.show(films);

        System.out.println("Sap xep theo ten:");
        service.sortByTitle(films);

        System.out.println("Sap xep theo do dai");
        service.sortByLenghth(films);

        System.out.println("Sap xep theo luot xem");
        service.sortByView(films);

        System.out.println("Sap xep theo nam xuat ban");
        service.sortByYear(films);
    }
}

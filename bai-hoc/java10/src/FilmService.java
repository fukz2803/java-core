import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FilmService {

    public ArrayList<Film> getAllFilms() {
        ArrayList<Film> films = new ArrayList<>();
        films.add(new Film(1,"ABCSJ",120,"Kinh di",4000,1986));
        films.add(new Film(2,"NASNKFJN",150,"Kinh di",12002,1977));
        films.add(new Film(3,"VCAIVAKJ",170,"Kinh di",5828,1929));

        return films;
    }

    public void show(ArrayList<Film> film){
        for (Film f: film
             ) {
            System.out.println(f);
        }
    }
    
    public void sortByTitle(ArrayList<Film> films){
        Collections.sort(films, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        show(films);
    }

    public void sortByLenghth(ArrayList<Film> films){
        Collections.sort(films, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getLength() - o2.getLength();
            }
        });
        show(films);
    }

    public void sortByView(ArrayList<Film> films){
        Collections.sort(films, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getView() - o2.getView();
            }
        });
        show(films);
    }

    public void sortByYear(ArrayList<Film> films){
        Collections.sort(films, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getYear() - o2.getYear();
            }
        });
        show(films);
    }

}

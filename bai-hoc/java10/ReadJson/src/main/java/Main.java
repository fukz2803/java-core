import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        PersonService service = new PersonService();
//        ArrayList<Person> persons = service.getAllPerson();
//        service.show(persons);

        FilmService service = new FilmService();
        ArrayList<Film> films = service.getAllFilm();
        service.show(films);
    }
}

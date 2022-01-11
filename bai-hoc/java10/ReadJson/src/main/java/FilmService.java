import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class FilmService {

    public ArrayList<Film> getAllFilm(){
        ArrayList<Film> films = new ArrayList<>();

        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("movie.json");
            Type type = new TypeToken<ArrayList<Film>>(){}.getType();

            films = gson.fromJson(reader,type);
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        }

        return films;
    }

    public void show(ArrayList<Film> films){
        for (Film f : films
             ) {
            System.out.println(f);
        }
    }

}

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;

public class MovieService {

    public ArrayList<Movie> getAllMovie(){
        ArrayList<Movie> movies = new ArrayList<>();
        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("movie.json");
            Type type = new TypeToken<ArrayList<Movie>>(){}.getType();
            movies = gson.fromJson(reader,type);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return movies;
    }

    public void show(ArrayList<Movie> movies){
        for (Movie m : movies
             ) {
            System.out.println(m);
        }
    }

    public void sortByTitle(ArrayList<Movie> movies){
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareToIgnoreCase(o2.getTitle());
            }
        });
        show(movies);
    }

    public void sortByYear(ArrayList<Movie> movies){
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getYear() - o2.getYear();
            }
        });
        show(movies);
    }

    public void searchByTitle(ArrayList<Movie> movies, String title){
        for (Movie m : movies
             ) {
            if (m.getTitle().toLowerCase().contains(title.toLowerCase())){
                System.out.println(m);
            }
        }
    }


    public void searchByCategory(ArrayList<Movie> movies, String category){
        for (Movie m : movies
             ) {
            if (Arrays.toString(m.getCategory()).toLowerCase().contains(category.toLowerCase())){
                System.out.println(m);
            }
        }
    }

    public void searchHighestView(ArrayList<Movie> movies) {
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.getView() - o1.getView();
            }
        });
        System.out.println(movies.get(0));
        System.out.println(movies.get(1));
        System.out.println(movies.get(2));
    }

}

package Exercise2;

import java.util.ArrayList;

public class Library<T> {
    public ArrayList<T> getLibrary(){
        ArrayList<T> library = new ArrayList<>();
        ArrayList<TextBookService> texbook = new ArrayList<>();
        ArrayList<NewSpaperService> newSpaper = new ArrayList<>();
        library.addAll(texbook,newSpaper);
    }
}

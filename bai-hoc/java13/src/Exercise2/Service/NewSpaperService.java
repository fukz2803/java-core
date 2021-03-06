package Exercise2.Service;

import Exercise2.Model.NewSpaper;

import java.time.LocalDate;
import java.util.ArrayList;

public class NewSpaperService {
    public ArrayList<NewSpaper> getAllNewSpaper(){
        ArrayList<NewSpaper> newSpapers = new ArrayList<>();

        newSpapers.add(new NewSpaper(1,"Hà Nội Mới", new String[]{"Tin tức, Chính trị"},"Bộ Chính trị", LocalDate.of(2012,1,10),2000,10));
        newSpapers.add(new NewSpaper(2,"Công An Nhân Dân", new String[]{"Tin tức, An ninh"},"Bộ Chính trị", LocalDate.of(2014,11,20),21000,15));
        newSpapers.add(new NewSpaper(3,"Pháp luật Việt Nam", new String[]{"Tin tức, Pháp luật"},"Bộ Chính trị", LocalDate.of(2022,1,10),22000,12));

        return newSpapers;
    }
}

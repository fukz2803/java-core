package Bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class HistoryService {

    public ArrayList<History> getAllHistory(){
        ArrayList<History> histories = new ArrayList<>();

        return histories;
    }

    public void show(ArrayList<History> histories){
        for (History h: histories
             ) {
            System.out.println(h);
        }
    }




}

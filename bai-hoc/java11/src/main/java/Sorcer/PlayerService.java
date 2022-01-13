package Sorcer;

import java.util.ArrayList;
import java.util.Random;

public class PlayerService {
    public ArrayList<Player> getAllPlayer() {
        ArrayList<Player> list = new ArrayList<>();
        list.add(new Player(1, "Đặng Văn Lâm", Position.GK));
        list.add(new Player(32, "Đặng Văn Trường", Position.GK));
        list.add(new Player(2, "Quế Ngọc Hải", Position.DF));
        list.add(new Player(4, "Sergio Ramos", Position.DF));
        list.add(new Player(3, "Pepe", Position.DF));
        list.add(new Player(5, "Nacho", Position.DF));
        list.add(new Player(26, "Vidic", Position.DF));
        list.add(new Player(30, "Van Dijk", Position.DF));
        list.add(new Player(6, "Kroos", Position.MF));
        list.add(new Player(8, "Iniesta", Position.MF));
        list.add(new Player(17, "Modric", Position.MF));
        list.add(new Player(36, "Casemiro", Position.MF));
        list.add(new Player(45, "Xavi", Position.MF));
        list.add(new Player(7, "Ronaldo", Position.FW));
        list.add(new Player(9, "Benzema", Position.FW));
        list.add(new Player(11, "Bale", Position.FW));
        list.add(new Player(10, "Messi", Position.FW));
        list.add(new Player(60, "Cavani", Position.FW));
        list.add(new Player(15, "Suarez", Position.FW));
        return list;
    }

    public void show(ArrayList<Player> players) {
        for (Player p : players
        ) {
            System.out.println(p);
        }
    }

    public ArrayList<Player> buildTeam(int df, int mf, int fw, ArrayList<Player> allPlayers) {
        ArrayList<Player> choiceTeam = new ArrayList<>();

        int teamNumber = allPlayers.size();

//        Chọn thủ môn
        Random random = new Random();

        int gkNumber = 0;
        int dfNumber = 0;
        int mfNumber = 0;
        int fwNumber = 0;

        while (gkNumber < 1) {
            int gkRandom = random.nextInt(teamNumber);
            if (allPlayers.get(gkRandom).getPosition() == Position.GK) {
                Player choicePlayer = allPlayers.get(gkRandom);
                choiceTeam.add(choicePlayer);
                gkNumber++;
            }
        }

//        Chọn hậu vệ
        while (dfNumber < df) {
            int dfRandom = random.nextInt(teamNumber);
            if (allPlayers.get(dfRandom).getPosition() == Position.DF) {
                if (!choiceTeam.contains(allPlayers.get(dfRandom))){
                    choiceTeam.add(allPlayers.get(dfRandom));
                    dfNumber++;
                }
            }
        }

//        Chọn tiền vệ
        while (mfNumber < mf){
            int mfRandom = random.nextInt(teamNumber);
            if (allPlayers.get(mfRandom).getPosition() == Position.MF){
                if (!choiceTeam.contains(allPlayers.get(mfRandom))){
                    choiceTeam.add(allPlayers.get(mfRandom));
                    mfNumber++;
                }
            }
        }

//        Chọn tiền đạo
        while (fwNumber < fw){
            int fwRandom = random.nextInt(teamNumber);
            if (allPlayers.get(fwRandom).getPosition() == Position.FW){
                if (!choiceTeam.contains(allPlayers.get(fwRandom))){
                    choiceTeam.add((allPlayers.get(fwRandom)));
                    fwNumber++;
                }
            }
        }

        return choiceTeam;
    }
}

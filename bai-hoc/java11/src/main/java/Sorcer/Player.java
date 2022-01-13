package Sorcer;

import Sorcer.Position;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Player {
    private int number;
    private String fullName;
    private Position position;


    @Override
    public String toString() {
        return
                "Số áo = " + number +
                " - Họ tên = '" + fullName + '\'' +
                " - Vị trí = " + position
                ;
    }
}

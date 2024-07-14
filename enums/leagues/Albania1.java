package client.enums.leagues;

import java.util.ArrayList;
import java.util.List;

import static java.time.chrono.JapaneseEra.values;

public enum Albania1 implements League{
    PARTIZANI("PARTIZANI");

    private String name;

    Albania1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<League> getClubs() {
        List<League> clubs = new ArrayList<>();
        for(Albania1 club : values()){
            clubs.add(club);
        }
        return clubs;
    }
}

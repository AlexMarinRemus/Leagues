package client.enums.leagues;

import java.util.ArrayList;
import java.util.List;

public enum Spain1 implements League{
    REAL_MADRID("REAL MADRID"),
    BARCELONA("BARCELONA"),
    REAL_SOCIEDAD("REAL SOCIEDAD"),
    ATLETICO_DE_MADRID("ATLETICO DE MADRID"),
    ATHLETIC_BILBAO("ATHLETIC BILBAO"),
    VALENCIA("VALENCIA"),
    VILLAREAL("VILLAREAL"),
    GIRONA("GIRONA"),
    SEVILLA("SEVILLA"),
    REAL_BETIS_BALOMPIE("REAL BETIS BALOMPIE"),
    OSASUNA("OSASUNA"),
    LAS_PALMAS("LAS PALMAS"),
    CELTA_DE_VIGO("CELTA DE VIGO"),
    MALLORCA("MALLORCA"),
    GETAFE("GETAFE"),
    DEPORTIVO_ALVAES("DEPORTIVO ALVAES"),
    RAYO_VALLECANO("RAYO_VALLECANO"),
    REAL_VALLADOLID("REAL VALLADOLID"),
    ESPANYOL_BARCELONA("ESPANYOL BARCELONA"),
    LEGANES("LEGANES");
    private String name;

    Spain1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<League> getClubs() {
        List<League> clubs = new ArrayList<>();
        for(Spain1 club : values()){
            clubs.add(club);
        }
        return clubs;
    }
}

package client.enums.leagues;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public enum Belgia1 implements League{

    BRUGGE_KV ("BRUGGE KV"),
    GENK("GENK"),
    ANDERLECHT("ANDERLECHT"),
    ROYAL_ANTWERP("ROYAL ANTWERP"),
    SAINT_GILLOISE("SAINT GILLOISE"),
    GENT("GENT"),
    BRUGGE("BRUGGE"),
    WESTERLO ("WESTERLO"),
    STANDARD_LIEGE("STANDARD LIEGE"),
    OUD_HEVERLEE_LEUVEN("OUD-HEVERLEE LEUVEN"),
    R_CHARLEROI("R CHARLEROI"),
    SINT_TRUIDENSE("SINT-TRUIDENSE"),
    KORTRIJK("KORTRIJK"),
    MECHELEN("MECHELEN"),
    DENDER_EH("DENDER EH"),
    BEERSCHOT_VA("BEERSCHOT V.A.");
    private String name;

    Belgia1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<League> getClubs() {
        List<League> clubs = new ArrayList<>();
        for(Belgia1 club : values()){
            clubs.add(club);
        }
        return clubs;
    }
}

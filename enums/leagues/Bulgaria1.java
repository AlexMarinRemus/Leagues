package client.enums.leagues;

import java.util.ArrayList;
import java.util.List;

public enum Bulgaria1 implements League{
    LUDOGORETS_RAZGRAD("LUDOGORETS RAZGRAD"),
    CSKA_SOFIA("CSKA-SOFIA"),
    LEVSKI_SOFIA("LEVSKI SOFIA"),
    BOTEV_PLOVDIV("BOTEV PLOVDIV"),
    CSKA_1948("CSKA 1948"),
    ARDA_KARDZHALI("ARDA KARDZHALI"),
    LOKOMOTIV_PLOVDIV("LOKOMOTIV PLOVDIV"),
    CHERNO_MORE_VARNA("CHERNO MORE VARNA"),
    KRUMOVGRAD("KRUMOVGRAD"),
    SLAVIA_SOFIA("SLAVIA SOFIA"),
    LOKOMOTIV_SOFIA("LOKOMOTIV SOFIA"),
    BOTEV_VRATSA("BOTEV VRATSA"),
    SPARTAK_VARNA("SPARTAK VARNA"),
    HEBAR_PAZARDZHIK("HEBAR PAZARDZHIK"),
    BEROE_STARA_ZAGORA("BEROE STARA ZAGORA"),
    SEPTEMVRI_SOFIA("SEPTEMVRI SOFIA");
    private String name;

    Bulgaria1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<League> getClubs() {
        List<League> clubs = new ArrayList<>();
        for(Bulgaria1 club : values()){
            clubs.add(club);
        }
        return clubs;
    }
}

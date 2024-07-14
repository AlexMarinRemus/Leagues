package client.enums.leagues;

import java.util.ArrayList;
import java.util.List;

public enum Italia1 implements League {
    INTER_MILAN("INTER MILAN"),
    AC_MILAN("AC MILAN"),
    JUVENTUS("JUVENTUS"),
    NAPOLI("NAPOLI"),
    ATALANTA("ATALANTA"),
    BOLOGNA_1909("BOLOGNA 1909"),
    AS_ROMA("AS ROMA"),
    FIORENTINA("FIORENTINA"),
    LAZIO("LAZIO"),
    GENOA("GENOA"),
    TORINO("TORINO"),
    UDINESE_CALCIO("UDINESE CALCIO"),
    LECCE("LECCE"),
    AC_MONZA("AC MONZA"),
    PARMA_CALCIO_1913("PARMA CALCIO 1913"),
    CAGLIARI_CALCIO("CAGLIARI CALCIO"),
    HELLAS_VERONA("HELLAS_VERONA"),
    COMO_1907("COMO 1907"),
    VENEZIA("VENEZIA"),
    EMPOLI("EMPOLI");
    private String name;

    Italia1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<League> getClubs() {
        List<League> clubs = new ArrayList<>();
        for(Italia1 club : values()){
            clubs.add(club);
        }
        return clubs;
    }
}

package client.enums.leagues;

import java.util.ArrayList;
import java.util.List;

public enum Romania2 implements League{
    CORVINUL_1921_HUNEDOARA("CORVINUL 1921 HUNEDOARA"),
    VOLUNTARI("VOLUNTARI"),
    U_CRAIOVA_1948("U CRAIOVA 1948"),
    ARGES("ARGES"),
    CSIKSZEREDA("CSIKSZEREDA"),
    STEAUA("STEAUA"),
    RESITA("RESITA"),
    CONCORDIA_CHIAJNA("CONCORDIA CHIAJNA"),
    SLATINA("SLATINA"),
    SELIMBAR("SELIMBAR"),
    CHINDIA("CHINDIA"),
    DUMBRAVITA("DUMBRAVITA"),
    MIOVENI("MIOVENI"),
    METALOGLOBUS_BUCHAREST("METALOGLOBUS BUCHAREST"),
    CEAHLAUL_PIATRA_NEAMT("CEAHLAUL PIATRA NEAMT"),
    VIITORUL_PANDURII_TARGU_JIU("VIITORUL PANDURII TARGU JIU"),
    BIHOR("BIHOR"),
    UNIREA_UNGHENI("UNIREA UNGHENI"),
    FOCSANI_2007("FOCSANI 2007"),
    METALUL_BUZAU("METALUL BUZAU"),
    MUSCELUL_CAMPULUNG_ELITE("MUSCELUL CAMPULUNG ELITE"),
    AFUMATI("AFUMATI");
    private String name;

    Romania2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<League> getClubs() {
        List<League> clubs = new ArrayList<>();
        for(Romania2 club : values()){
            clubs.add(club);
        }
        return clubs;
    }
}

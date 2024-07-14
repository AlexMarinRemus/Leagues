package client.enums.leagues;

import java.util.ArrayList;
import java.util.List;

public enum Romania1 implements League{
    UNIREA_SLOBOZIA("UNIREA SLOBOZIA"),
    SEPSI_OSK("SEPSI OSK"),
    UNIVERSITATEA_CRAIOVA("UNIVERSITATEA CRAIOVA"),
    HERMANNSTADT("HERMANNSTADT"),
    DINAMO_BUCURESTI("DINAMO BUCURESTI"),
    BOTOSANI("BOTOSANI"),
    CFR_CLUJ("CFR CLUJ"),
    PETROLUL("PETROLUL"),
    RAPID("RAPID"),
    UNIVERSITATEA_CLUJ("UNIVERSITATEA CLUJ"),
    FCSB("FCSB"),
    GLORIA_BUZAU("GLORIA BUZAU"),
    OTELUL_GALATI("OTELUL GALATI"),
    UTA_ARAD("UTA ARAD"),
    POLI_IASI("POLI IASI"),
    FARUL_CONSTANTA("FARUL CONSTANTA");

    private String name;

    Romania1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<League> getClubs() {
        List<League> clubs = new ArrayList<>();
        for(Romania1 club : values()){
            clubs.add(club);
        }
        return clubs;
    }
}

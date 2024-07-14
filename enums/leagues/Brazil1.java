package client.enums.leagues;

import java.util.ArrayList;
import java.util.List;

public enum Brazil1 implements League{

    SOCIEDADE_ESPORTIVA_PALMEIRAS("SOCIEDADE ESPORTIVA PALMEIRAS"),
    FLAMENGO("FLAMENGO"),
    BOTAFOGO_DE_FUTEBOL_E_REGATAS("BOTAFOGO DE FUTEBOL E REGATAS"),
    FLUMINENSE("FLUMINENSE"),
    ATLETICO_MINEIRO("ATLETICO MINEIRO"),
    CORINTHIANS_PAULISTA("CORINTHIANS PAULISTA"),
    SAO_PAULO ("SAO PAULO"),
    GREMIO_FOOT_BALL_PORTO_ALEGRENSE("GREMIO FOOT-BALL PORTO ALEGRENSE"),
    CRUZEIRO_ESPORTE_CLUBE("CRUZEIRO ESPORTE CLUBE"),
    SPORT_CLUB_INTERNACIONAL("SPORT CLUB INTERNACIONAL"),
    RED_BULL_BRAGANTINO("RED BULL BRAGANTINO"),
    VASCO_DA_GAMA ("VASCO DA GAMA"),
    ATHLETICO_PARANAENSE("ATHLETICO PARANAENSE"),
    BAHIA("BAHIA"),
    FORTALEZA("FORTALEZA"),
    CUIABA("CUIABA"),
    VITORIA("VITORIA"),
    GOIANIENSE("GOIANIENSE"),
    JUVENTUDE("JUVENTUDE"),
    CRICIUMA("CRICIUMA");


    private String name;

    Brazil1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<League> getClubs() {
        List<League> clubs = new ArrayList<>();
        for(Brazil1 club : values()){
            clubs.add(club);
        }
        return clubs;
    }
}

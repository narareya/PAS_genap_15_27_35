package com.example.pas_genap_15_27.API;

public class TeamModel {
    private String strTeam;
    private String strStadium;

    public String getStrLocation() {
        return strLocation;
    }

    private String strLocation;

    public String getStrSport() {
        return strSport;
    }

    private String strSport;

    public String getStrTeam() {
        return strTeam;
    }

    public String getStrStadium() {
        return strStadium;
    }

    public String getStrBadge() {
        return strBadge;
    }

    private String strBadge;


    public TeamModel (String strTeam, String strStadium,String strBadge,String strSport,String strLocation){
        this.strTeam = strTeam;
        this.strStadium = strStadium;
        this.strBadge = strBadge;
        this.strSport = strSport;
        this.strLocation = strLocation;
    }
}

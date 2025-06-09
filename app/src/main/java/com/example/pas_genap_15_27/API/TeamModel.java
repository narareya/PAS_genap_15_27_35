package com.example.pas_genap_15_27.API;

public class TeamModel {
    private String strTeam;
    private String strStadium;
    private String strLocation;
    private String strSport;
    private String strBadge;


    public String getStrLocation() {
        return strLocation;
    }

    public String getStrSport() {
        return strSport;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public String getStrStadium() {
        return strStadium;
    }

    public String getStrBadge() {
        return strBadge;
    }


    public TeamModel (String strTeam, String strStadium,String strBadge,String strSport,String strLocation){
        this.strTeam = strTeam;
        this.strStadium = strStadium;
        this.strBadge = strBadge;
        this.strSport = strSport;
        this.strLocation = strLocation;
    }
}

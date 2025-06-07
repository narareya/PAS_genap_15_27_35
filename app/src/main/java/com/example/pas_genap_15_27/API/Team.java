package com.example.pas_genap_15_27.API;

public class Team {

    // Countries
    private String name_en;
    private String flag_url_32;

    // Premier
    private String strTeam;
    private String strStadium;
    private String strBadge;

    // Sports
    private String strSportIconGreen;
    private String strSport;
    private String strSportDescription;

    public Team(String name_en, String flag_url_32, String strTeam, String strStadium, String strBadge, String strSport, String strSportDescription, String strSportIconGreen){
        this.name_en=name_en;
        this.flag_url_32=flag_url_32;
        this.strTeam=strTeam;
        this.strStadium=strStadium;
        this.strBadge=strBadge;
        this.strSport=strSport;
        this.strSportDescription=strSportDescription;
        this.strSportIconGreen=strSportIconGreen;
    }

    public String getStrSportIconGreen() { return strSportIconGreen; }

    public String getStrSport() { return strSport; }

    public String getStrSportDescription() { return strSportDescription;}

    public String getStrTeam() { return strTeam; }

    public String getStrStadium() { return strStadium; }

    public String getStrBadge() { return strBadge; }

    public String getFlag_url_32() { return flag_url_32; }

    public String getName_en() { return name_en; }
}
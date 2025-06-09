package com.example.pas_genap_15_27.API;

public class AllSportsModel {
    // Sports
    private String strSportIconGreen;
    private String strSport;
    private String strSportDescription;

    public String getStrSportIconGreen() {
        return strSportIconGreen;
    }

    public String getStrSport() {
        return strSport;
    }

    public String getStrSportDescription() {
        return strSportDescription;
    }

    public AllSportsModel (String strSportIconGreen, String strSport, String strSportDescription) {
        this.strSport = strSport;
        this.strSportDescription = strSportDescription;
        this.strSportIconGreen = strSportIconGreen;
    }
}

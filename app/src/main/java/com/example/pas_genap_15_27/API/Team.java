package com.example.pas_genap_15_27.API;

public class Team {

    private String name_en;
    private String flag_url_32;

    public Team(String name_en, String flag_url_32){
        this.name_en=name_en;
        this.flag_url_32=flag_url_32;
    }

    public String getFlag_url_32() {
        return flag_url_32;
    }

    public String getName_en() {
        return name_en;
    }
}

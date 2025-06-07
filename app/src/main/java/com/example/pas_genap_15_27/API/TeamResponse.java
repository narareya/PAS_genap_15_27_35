package com.example.pas_genap_15_27.API;

import com.example.pas_genap_15_27.CountriesFragment;

import java.util.List;

public class TeamResponse {
    // untuk tempat data
    private List<Team> teams;
    private List<Team> countries;
    private List<Team> sports;

    public List<Team> getTeams() { return teams; }
    public List<Team> getCountries() { return countries; }
    public List<Team> getSports() { return sports; }

}
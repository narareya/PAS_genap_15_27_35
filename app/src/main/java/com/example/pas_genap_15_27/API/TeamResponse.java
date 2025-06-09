package com.example.pas_genap_15_27.API;

import com.example.pas_genap_15_27.CountriesFragment;

import java.util.List;

public class TeamResponse {
    // untuk tempat data
    private List<TeamModel> teams;
    private List<Team> countries;
    private List<AllSportsModel> sports;

    public List<TeamModel> getTeams() { return teams; }
    public List<Team> getCountries() { return countries; }
    public List<AllSportsModel> getSports() { return sports; }

}
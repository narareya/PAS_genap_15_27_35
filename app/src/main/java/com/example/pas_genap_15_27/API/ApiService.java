package com.example.pas_genap_15_27.API;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("all_countries.php")
    Call<TeamResponse> getAllTeams(@Query("l") String country);

    @GET("search_all_teams.php")
    Call<TeamResponse> getLeague(@Query("l") String league);

    @GET("all_sports.php")
    Call<TeamResponse> getSports();
}
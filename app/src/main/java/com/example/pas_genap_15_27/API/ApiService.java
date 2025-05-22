package com.example.pas_genap_15_27.API;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("search_all_country.php")
    Call<TeamResponse> getAllTeams(@Query("l") String country);


}

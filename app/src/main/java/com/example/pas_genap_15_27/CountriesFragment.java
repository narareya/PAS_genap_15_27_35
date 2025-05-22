package com.example.pas_genap_15_27;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pas_genap_15_27.API.ApiClient;
import com.example.pas_genap_15_27.API.ApiService;
import com.example.pas_genap_15_27.API.Team;
import com.example.pas_genap_15_27.API.CountryAdapter;
import com.example.pas_genap_15_27.API.TeamResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class CountriesFragment extends Fragment {

    RecyclerView recyclerView;

    ProgressBar progressBar;

    CountryAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_countries, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        progressBar = view.findViewById(R.id.progressBar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        progressBar.setVisibility(View.VISIBLE);

        ApiService apiService = ApiClient.getRetrofitInstance().create(ApiService.class);
        apiService.getAllTeams("countries").enqueue(new Callback<TeamResponse>() {
            @Override
            public void onResponse(Call<TeamResponse> call, Response<TeamResponse> response) {
                progressBar.setVisibility(View.GONE);
                if (response.isSuccessful() && response.body() != null) {
                    List<CountriesFragment> teams = response.body().getCountries();
                    adapter = new CountryAdapter(getContext(), teams);
                    recyclerView.setAdapter(adapter);
                } else {
                    Toast.makeText(getContext(), "Data kosong atau error", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<TeamResponse> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(getContext(), "Gagal mengambil data", Toast.LENGTH_SHORT).show();
                t.printStackTrace();
            }
        });
        return view;
    }
}
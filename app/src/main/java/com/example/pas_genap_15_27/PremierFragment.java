package com.example.pas_genap_15_27;

import android.os.Bundle;
import android.util.Log;
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
import com.example.pas_genap_15_27.API.PremierAdapter;
import com.example.pas_genap_15_27.API.Team;
import com.example.pas_genap_15_27.API.TeamModel;
import com.example.pas_genap_15_27.API.TeamResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PremierFragment extends Fragment {
    RecyclerView recyclerView;
    ProgressBar progressBar;
    PremierAdapter premierAdapter;
    List<TeamModel> teams = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_premiere, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        progressBar = view.findViewById(R.id.progressBar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        progressBar.setVisibility(View.VISIBLE);

        ApiService apiService = ApiClient.getRetrofitInstance().create(ApiService.class);
        apiService.getLeague("English Premier League").enqueue(new Callback<TeamResponse>() {
            @Override
            public void onResponse(Call<TeamResponse> call, Response<TeamResponse> response) {
                progressBar.setVisibility(View.GONE);
                if (response.isSuccessful() && response.body() != null) {
                    teams = response.body().getTeams();
                    premierAdapter = new PremierAdapter(getContext(), teams);
                    recyclerView.setAdapter(premierAdapter);
                    Log.d("IS_RUNNING", "SUCCESSFUL");
                } else {
                    Toast.makeText(getContext(), "Data kosong atau error", Toast.LENGTH_SHORT).show();
                    Log.d("IS_RUNNING", "FAILED");
                }
            }

            @Override
            public void onFailure(Call<TeamResponse> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(getContext(), "Gagal mengambil data", Toast.LENGTH_SHORT).show();
                t.printStackTrace();
                Log.d("IS_RUNNING", "Failure");
            }
        });
        return view;
    }
}
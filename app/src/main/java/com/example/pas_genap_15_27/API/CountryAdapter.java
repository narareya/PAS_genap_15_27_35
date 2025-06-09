package com.example.pas_genap_15_27.API;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pas_genap_15_27.CountriesFragment;
import com.example.pas_genap_15_27.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {

    private List<Team> countryList;

    private Context context;

    public CountryAdapter(Context context, List<Team> countryList){
        this.context = context;
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_team, parent, false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CountryViewHolder holder, int position) {
        Team team = countryList.get(position);
        holder.txtCountryName.setText(team.getName_en());
        Picasso.get().load(team.getFlag_url_32()).into(holder.imageLogo);
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public static class CountryViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageLogo;
        TextView txtCountryName;


        public CountryViewHolder(View itemView) {
            super(itemView);
            txtCountryName = itemView.findViewById(R.id.tvNamaTim);
            imageLogo = itemView.findViewById(R.id.ivBadgeTeam);
        }
    }


}
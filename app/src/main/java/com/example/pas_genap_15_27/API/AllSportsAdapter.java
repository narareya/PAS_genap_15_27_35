package com.example.pas_genap_15_27.API;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pas_genap_15_27.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AllSportsAdapter extends RecyclerView.Adapter<AllSportsAdapter.TeamViewHolder> {
    private List<Team> sportsList;
    private Context context;

    public AllSportsAdapter(Context context, List<Team> sportsList) {
        this.context = context;
        this.sportsList = sportsList;
    }

    @NonNull
    @Override
    public AllSportsAdapter.TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_team, parent, false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllSportsAdapter.TeamViewHolder holder, int position) {
        Team sport = sportsList.get(position);
        holder.txtSport.setText(sport.getStrSport());
        holder.txtDescription.setText(sport.getStrSportDescription());
        Picasso.get().load(sport.getStrSportIconGreen()).into(holder.imageLogo);
    }

    @Override
    public int getItemCount() {
        return sportsList.size();
    }

    public static class TeamViewHolder extends RecyclerView.ViewHolder {
        TextView txtSport, txtDescription;
        ImageView imageLogo;

        public TeamViewHolder(@NonNull View itemView) {
            super(itemView);
            txtSport = itemView.findViewById(R.id.txtTeamName);
            txtDescription = itemView.findViewById(R.id.txtStadiumName);
            imageLogo = itemView.findViewById(R.id.imageLogo);
        }
    }
}
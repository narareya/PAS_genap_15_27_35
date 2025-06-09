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

public class PremierAdapter extends RecyclerView.Adapter<PremierAdapter.TeamViewHolder> {
    private List<TeamModel> teamList;
    private Context context;

    public PremierAdapter(Context context, List<TeamModel> teamList) {
        this.context = context;
        this.teamList = teamList;
    }

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_team, parent, false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PremierAdapter.TeamViewHolder holder, int position) {
        TeamModel team = teamList.get(position);
        holder.txtTeamName.setText(team.getStrTeam());
        holder.txtStadiumName.setText(team.getStrStadium());
        Picasso.get().load(team.getStrBadge()).into(holder.imageLogo);
        holder.txtSport.setText(team.getStrSport());
        holder.txtLocation.setText(team.getStrLocation());
    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }

    public static class TeamViewHolder extends RecyclerView.ViewHolder {
        TextView txtTeamName, txtStadiumName,txtSport,txtLocation;
        ImageView imageLogo;

        public TeamViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTeamName = itemView.findViewById(R.id.tvNamaTim);
            txtStadiumName = itemView.findViewById(R.id.tvStadium);
            imageLogo = itemView.findViewById(R.id.ivBadgeTeam);
            txtSport = itemView.findViewById(R.id.tvSport);
            txtLocation = itemView.findViewById(R.id.tvLocation);
        }
    }
}
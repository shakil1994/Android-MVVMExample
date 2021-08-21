package com.blackbirds.shakil.mvvmjsonexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.blackbirds.shakil.mvvmjsonexample.R;
import com.blackbirds.shakil.mvvmjsonexample.model.MovieModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MyViewHolder> {

    Context context;
    List<MovieModel> movieModelList;

    public MovieListAdapter(Context context, List<MovieModel> movieModelList) {
        this.context = context;
        this.movieModelList = movieModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.layout_item, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Picasso.get().load(movieModelList.get(i).getImageurl()).into(myViewHolder.image);
        myViewHolder.txt_name.setText(movieModelList.get(i).getName());
        myViewHolder.txt_team.setText(movieModelList.get(i).getTeam());
        myViewHolder.txt_createdby.setText(movieModelList.get(i).getCreatedby());
    }

    @Override
    public int getItemCount() {
        return movieModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView txt_name, txt_team, txt_createdby;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            txt_name = itemView.findViewById(R.id.txt_name);
            txt_team = itemView.findViewById(R.id.txt_team);
            txt_createdby = itemView.findViewById(R.id.txt_createdby);
        }
    }
}

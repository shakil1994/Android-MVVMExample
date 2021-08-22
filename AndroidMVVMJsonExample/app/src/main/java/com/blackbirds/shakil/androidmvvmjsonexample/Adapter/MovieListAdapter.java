package com.blackbirds.shakil.androidmvvmjsonexample.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.blackbirds.shakil.androidmvvmjsonexample.Model.MovieModel;
import com.blackbirds.shakil.androidmvvmjsonexample.R;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MyViewHolder> {

    Context context;
    List<MovieModel> movieModelList;

    public MovieListAdapter(Context context, List<MovieModel> movieModelList) {
        this.context = context;
        this.movieModelList = movieModelList;
    }

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_movie_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {
        Picasso.get().load(movieModelList.get(position).getImageurl()).into(holder.imgMovie);
        holder.txtMovieName.setText(movieModelList.get(position).getName());
        holder.txtTeam.setText(movieModelList.get(position).getTeam());
        holder.txtCreatedby.setText(movieModelList.get(position).getCreatedby());
    }

    @Override
    public int getItemCount() {
        return movieModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgMovie;
        TextView txtMovieName, txtTeam, txtCreatedby;

        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            imgMovie = itemView.findViewById(R.id.imgMovie);
            txtMovieName = itemView.findViewById(R.id.txtMovieName);
            txtTeam = itemView.findViewById(R.id.txtTeam);
            txtCreatedby = itemView.findViewById(R.id.txtCreatedby);
        }
    }
}

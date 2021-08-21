package com.blackbirds.shakil.mvvmjsonexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.blackbirds.shakil.mvvmjsonexample.adapter.MovieListAdapter;
import com.blackbirds.shakil.mvvmjsonexample.model.MovieModel;
import com.blackbirds.shakil.mvvmjsonexample.viewModel.MainActivityViewModel;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity {

    MainActivityViewModel mainActivityViewModel;

    RecyclerView recyclerView;
    MovieListAdapter adapter;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mainActivityViewModel.getMovieList().observe(this, movieModels -> {
            if (movieModels != null){
                adapter = new MovieListAdapter(this, movieModels);
                adapter.notifyDataSetChanged();
                recyclerView.setAdapter(adapter);
            }
        });

        /*recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        mainActivityViewModel.getMoviesListObserver().observe(this, movieModels -> {
            if (movieModels != null){
                adapter = new MovieListAdapter(getBaseContext(), movieModels);
                adapter.notifyDataSetChanged();
                recyclerView.setAdapter(adapter);
            }
        });
        mainActivityViewModel.makeAPICall();*/
    }
}
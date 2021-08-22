package com.blackbirds.shakil.androidmvvmjsonexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.blackbirds.shakil.androidmvvmjsonexample.Adapter.MovieListAdapter;
import com.blackbirds.shakil.androidmvvmjsonexample.ViewModel.MainActivityViewModel;

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
            Log.e("MainActivity", "MovieList: " + movieModels.get(0).getName());

            if (movieModels != null){
                adapter = new MovieListAdapter(this, movieModels);
                adapter.notifyDataSetChanged();
                recyclerView.setAdapter(adapter);
            }
        });
    }
}
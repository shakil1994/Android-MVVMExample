package com.blackbirds.shakil.androidmvvmjsonexample.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.blackbirds.shakil.androidmvvmjsonexample.Model.MovieModel;
import com.blackbirds.shakil.androidmvvmjsonexample.Repositories.MainRepo;

import java.util.List;

public class MainActivityViewModel extends ViewModel {
    private final MainRepo mainRepo;

    public MainActivityViewModel() {
        mainRepo = new MainRepo();
    }

    public LiveData<List<MovieModel>> getMovieList(){
        return mainRepo.getMovieModelLiveData();
    }
}

package com.blackbirds.shakil.mvvmjsonexample.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.blackbirds.shakil.mvvmjsonexample.model.MovieModel;
import com.blackbirds.shakil.mvvmjsonexample.repositories.MainRepo;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private final MainRepo repo;

    public MainActivityViewModel() {
        repo = new MainRepo();
    }

    public LiveData<List<MovieModel>> getMovieList(){
        return repo.getMovieModelLiveData();
    }
    /*private MutableLiveData<List<MovieModel>> moviesList;

    public MainActivityViewModel() {
        moviesList = new MutableLiveData<>();
    }

    public MutableLiveData<List<MovieModel>> getMoviesListObserver(){
        return moviesList;
    }

    public void makeAPICall(){
        APIService apiService = Retrofit.getClient().create(APIService.class);
        Call<List<MovieModel>> call = apiService.getMovieList();
        call.enqueue(new Callback<List<MovieModel>>() {
            @Override
            public void onResponse(Call<List<MovieModel>> call, Response<List<MovieModel>> response) {
                moviesList.postValue(response.body());
            }

            @Override
            public void onFailure(Call<List<MovieModel>> call, Throwable t) {
                moviesList.postValue(null);
            }
        });
    }*/
}

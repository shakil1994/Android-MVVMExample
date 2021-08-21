package com.blackbirds.shakil.mvvmjsonexample.repositories;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.blackbirds.shakil.mvvmjsonexample.Common.Common;
import com.blackbirds.shakil.mvvmjsonexample.model.MovieModel;
import com.blackbirds.shakil.mvvmjsonexample.network.APIService;
import com.blackbirds.shakil.mvvmjsonexample.network.Retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainRepo {
    private static final String TAG = "MainRepo";
    private APIService apiService;

    public MainRepo() {
        this.apiService = Common.getApiService();
    }

    public MutableLiveData<List<MovieModel>> getMovieModelLiveData(){
        MutableLiveData<List<MovieModel>> data = new MutableLiveData<>();
        apiService.getMovieList().enqueue(new Callback<List<MovieModel>>() {
            @Override
            public void onResponse(Call<List<MovieModel>> call, Response<List<MovieModel>> response) {
                Log.e(TAG, "onResponse: " + response.code());
                if (response.isSuccessful()) {
                    data.setValue(response.body());
                } else {
                    data.setValue(null);
                }
            }

            @Override
            public void onFailure(Call<List<MovieModel>> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
                data.setValue(null);
            }
        });
        return data;
    }
}

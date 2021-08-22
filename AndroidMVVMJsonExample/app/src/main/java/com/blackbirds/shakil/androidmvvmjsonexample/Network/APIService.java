package com.blackbirds.shakil.androidmvvmjsonexample.Network;

import com.blackbirds.shakil.androidmvvmjsonexample.Model.MovieModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("marvel")
    Call<List<MovieModel>> getMovieList();
}

package com.blackbirds.shakil.mvvmjsonexample.network;

import com.blackbirds.shakil.mvvmjsonexample.model.MovieModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("marvel")
    Call<List<MovieModel>> getMovieList();
}

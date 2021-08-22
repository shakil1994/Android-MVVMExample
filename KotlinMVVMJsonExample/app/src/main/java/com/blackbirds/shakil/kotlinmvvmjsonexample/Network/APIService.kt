package com.blackbirds.shakil.kotlinmvvmjsonexample.Network

import com.blackbirds.shakil.kotlinmvvmjsonexample.Model.MovieModel
import retrofit2.Call
import retrofit2.http.GET

interface APIService {
    @GET("marvel")
    fun getMovieList(): Call<MutableList<MovieModel>>
}
package com.blackbirds.shakil.kotlinmvvmjsonexample.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.blackbirds.shakil.kotlinmvvmjsonexample.Model.MovieModel
import com.blackbirds.shakil.kotlinmvvmjsonexample.Repositories.MainRepo

class MainActivityViewModel : ViewModel() {
    private val mainRepo: MainRepo
    val getMovieList: LiveData<MutableList<MovieModel>>
        get() = mainRepo.getMovieModelLiveData

    init {
        mainRepo = MainRepo()
    }
}
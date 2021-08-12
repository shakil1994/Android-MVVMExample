package com.blackbirds.shakil.mvvmexamplekotlin.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var resultMutableLivedata: MutableLiveData<String>? = null
    fun addFunction(numberOne: String, numberTwo: String): MutableLiveData<String> {
        val numOne = numberOne.toInt()
        val numTwo = numberTwo.toInt()
        val result = numOne + numTwo
        if (resultMutableLivedata == null) {
            resultMutableLivedata = MutableLiveData()
        }
        resultMutableLivedata!!.value = result.toString()
        return resultMutableLivedata as MutableLiveData<String>
    }
}
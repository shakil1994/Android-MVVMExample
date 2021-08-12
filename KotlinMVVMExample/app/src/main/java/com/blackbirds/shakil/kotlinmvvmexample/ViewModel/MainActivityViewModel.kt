package com.blackbirds.shakil.kotlinmvvmexample.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var resultMutableLiveData: MutableLiveData<String>? = null

    fun addFunction(valueOne: String, valueTwo: String): MutableLiveData<String> {
        val numOne = valueOne.toInt()
        val numTow = valueTwo.toInt()
        val result = numOne + numTow

        if (resultMutableLiveData == null){
            resultMutableLiveData = MutableLiveData()
        }
        resultMutableLiveData!!.value = result.toString()

        return resultMutableLiveData as MutableLiveData<String>
    }
}
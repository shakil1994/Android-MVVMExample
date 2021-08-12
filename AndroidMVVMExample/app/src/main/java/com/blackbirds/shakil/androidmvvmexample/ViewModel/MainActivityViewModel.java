package com.blackbirds.shakil.androidmvvmexample.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    MutableLiveData<String> resultMutableLivedata;

    public MutableLiveData<String> addFunction(String numberOne, String numberTwo){
        int numOne = Integer.parseInt(numberOne);
        int numTwo = Integer.parseInt(numberTwo);
        int result = numOne + numTwo;

        if (resultMutableLivedata == null){
            resultMutableLivedata = new MutableLiveData<>();
        }
        resultMutableLivedata.setValue(String.valueOf(result));

        return resultMutableLivedata;
    }
}

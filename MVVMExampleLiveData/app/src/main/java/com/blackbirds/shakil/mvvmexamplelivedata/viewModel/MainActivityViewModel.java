package com.blackbirds.shakil.mvvmexamplelivedata.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    MutableLiveData<String> resultLiveData;

    public MutableLiveData<String> addFunction(String valueOne, String valueTwo){
        int numOne = Integer.parseInt(valueOne);
        int numTwo = Integer.parseInt(valueTwo);
        int result = numOne + numTwo;

        if (resultLiveData == null){
            resultLiveData = new MutableLiveData<>();
        }
        resultLiveData.setValue(String.valueOf(result));

        return resultLiveData;
    }
}

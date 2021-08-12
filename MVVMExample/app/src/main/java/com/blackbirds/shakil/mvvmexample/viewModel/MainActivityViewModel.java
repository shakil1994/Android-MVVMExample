package com.blackbirds.shakil.mvvmexample.viewModel;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    public String addFunction(String valueOne, String valueTwo){
        int numOne = Integer.parseInt(valueOne);
        int numTwo = Integer.parseInt(valueTwo);
        int result = numOne + numTwo;

        return String.valueOf(result);
    }
}

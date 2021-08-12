package com.blackbirds.shakil.androidmvvmexample.ViewModel;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    public String addFunction(String numberOne, String numberTwo){
        int numOne = Integer.parseInt(numberOne);
        int numTwo = Integer.parseInt(numberTwo);
        int result = numOne + numTwo;

        return String.valueOf(result);
    }
}

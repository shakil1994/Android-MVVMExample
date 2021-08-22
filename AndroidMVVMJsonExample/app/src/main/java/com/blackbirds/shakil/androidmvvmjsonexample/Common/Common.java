package com.blackbirds.shakil.androidmvvmjsonexample.Common;

import com.blackbirds.shakil.androidmvvmjsonexample.Network.APIService;
import com.blackbirds.shakil.androidmvvmjsonexample.Network.Retrofit;

public class Common {
    private static final String BASE_URL = "https://www.simplifiedcoding.net/demos/";

    public static APIService getAPIService(){
        return Retrofit.getRetrofitClient(BASE_URL).create(APIService.class);
    }
}

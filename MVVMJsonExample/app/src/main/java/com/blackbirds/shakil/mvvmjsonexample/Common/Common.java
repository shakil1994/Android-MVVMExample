package com.blackbirds.shakil.mvvmjsonexample.Common;

import com.blackbirds.shakil.mvvmjsonexample.network.APIService;
import com.blackbirds.shakil.mvvmjsonexample.network.Retrofit;

public class Common {
    private static final String BASE_URL = "https://www.simplifiedcoding.net/demos/";

    public static APIService getApiService() {
        return Retrofit.getClient(BASE_URL).create(APIService.class);
    }
}

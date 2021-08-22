package com.blackbirds.shakil.kotlinmvvmjsonexample.Common

import com.blackbirds.shakil.kotlinmvvmjsonexample.Network.APIService
import com.blackbirds.shakil.kotlinmvvmjsonexample.Network.Retrofit

object Common {
    private const val BASE_URL = "https://www.simplifiedcoding.net/demos/"
    val getAPIService: APIService
    get() = Retrofit.getRetrofitClient(BASE_URL).create(APIService::class.java)
}
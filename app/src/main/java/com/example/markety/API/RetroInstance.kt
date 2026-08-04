package com.example.markety.API

import com.example.markety.features.Home.data.remote.ProductApi
import com.example.markety.features.auth.data.remote.AuthApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit =
        Retrofit.Builder().baseUrl("https://ecommerce-nodejs-mu.vercel.app/").addConverterFactory(GsonConverterFactory.create()).build()
    val api: AuthApi = retrofit.create(AuthApi::class.java)
    val productApi: ProductApi = retrofit.create(ProductApi::class.java)
}
package com.example.markety.features.Home.data.repository

import android.util.Log
import com.example.markety.API.RetrofitInstance
import com.example.markety.features.Home.data.models.Product
import com.example.markety.features.Home.data.models.ProductsResponse
import com.example.markety.features.Home.data.remote.ProductApi

class ProductsRepository {
    suspend fun getProducts(): Result<ProductsResponse>{
        try {
            val response = RetrofitInstance.productApi.getProducts()

            if(response.isSuccessful){
                Log.d("Product Response", "getProducts: ${response.body()}")
                return Result.success(response.body()!!)
                }else{
                return Result.failure(Exception("products failed"))
            }
        }catch (e: Exception){
            return Result.failure(Exception(e))
        }

    }
}
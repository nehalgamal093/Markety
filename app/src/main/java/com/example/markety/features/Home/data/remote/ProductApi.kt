package com.example.markety.features.Home.data.remote

import com.example.markety.features.Home.data.models.ProductsResponse
import retrofit2.Response
import retrofit2.http.GET

interface ProductApi {
    @GET("api/v1/products?subCategory=6a720e3adbf009623cc67db7")
    suspend fun getProducts(): Response<ProductsResponse>
}
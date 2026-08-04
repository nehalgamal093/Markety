package com.example.markety.features.Home.data.models

import com.google.gson.annotations.SerializedName

data class ProductsResponse(
    val pages: Int,
    val message: String,
    val page: Int,
    val pagePerCategory: Int,

    @SerializedName("result")
    val products: List<Product>


)

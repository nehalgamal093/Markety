package com.example.markety.features.Home.data.models

data class Product(
    val title:String,
    val slug:String,
    val price:Double,
    val priceAfterDiscount:Double?,
    val ratingAvg: Double,
    val ratingCount:Int,
    val description:String,
    val images:List<ProductImage>,
    val category:String,
    val subCategory:String,
    val brand:String

)

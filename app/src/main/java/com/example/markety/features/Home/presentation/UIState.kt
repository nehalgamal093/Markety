package com.example.markety.features.Home.presentation

import com.example.markety.features.Home.data.models.Product

data class ProductUiState(
    val products: List<Product> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)

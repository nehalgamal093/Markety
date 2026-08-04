package com.example.markety.features.Home.presentation.ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.markety.features.Home.data.models.Product
import com.example.markety.features.Home.data.repository.ProductsRepository
import com.example.markety.features.Home.presentation.ProductUiState
import com.example.markety.features.auth.data.repository.AuthRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProductViewModel() : ViewModel() {
    private val repository = ProductsRepository()

    var uiState by mutableStateOf(ProductUiState())
        private set


    init {
        loadProducts()
    }

    private fun loadProducts() {
        viewModelScope.launch(Dispatchers.IO) {
            uiState = uiState.copy(isLoading = true)
            val result = repository.getProducts()
            uiState = if (result.isSuccess) {
                uiState.copy(
                    products = result.getOrNull()?.products ?: emptyList(),
                    isLoading = false,
                    error = null
                )
            } else {
                uiState.copy(
                    isLoading = false,
                    error = result.exceptionOrNull()?.message
                )
            }

        }
    }
}

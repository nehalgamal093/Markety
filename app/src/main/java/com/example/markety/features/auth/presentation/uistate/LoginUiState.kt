package com.example.markety.features.auth.presentation.uistate

data class LoginUiState(
    val email: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
    val error: String? = null,
    val token: String? = null
)

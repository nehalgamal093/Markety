package com.example.markety.features.auth.presentation.uistate

data class RegisterUiState (
    val name: String = "nehal",
    val email: String = "",
    val password: String = "",
    val phone: String = "0125874587",
    val isLoading: Boolean = false,
    val registerSuccess : Boolean = false,
    val error: String? = null,
)

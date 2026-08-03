package com.example.markety.features.auth.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.markety.features.auth.data.repository.AuthRepository
import com.example.markety.features.auth.presentation.uistate.RegisterUiState
import kotlinx.coroutines.launch

class RegisterViewModel : ViewModel() {
    private val repository = AuthRepository()
    var uiState by mutableStateOf(RegisterUiState())
    private set

    fun updateEmail(email:String){
        uiState = uiState.copy(email = email)
    }

    fun updatePassword(password:String){
        uiState = uiState.copy(password = password)
    }

    fun updateName(name:String){
        uiState = uiState.copy(name = name)
    }

    fun updatePhone(phone:String){
        uiState = uiState.copy(phone = phone)
    }

    fun register(){
        viewModelScope.launch {
            uiState = uiState.copy(
                isLoading = true,
                error = null
            )
            val result = repository.register(uiState.email,uiState.password,uiState.name,uiState.phone)
            uiState = if(result.isSuccess){
                uiState.copy(
                    isLoading =  false,
                    registerSuccess = true
                )

            }else{
                uiState.copy(
                    isLoading = false,
                    error = result.exceptionOrNull()?.message
                )
            }
        }
    }

}
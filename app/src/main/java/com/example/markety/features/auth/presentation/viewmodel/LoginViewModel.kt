package com.example.markety.features.auth.presentation.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.markety.features.auth.data.repository.AuthRepository
import com.example.markety.features.auth.presentation.uistate.LoginUiState
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel(){

    private  val repository = AuthRepository()

    var uiState by mutableStateOf(LoginUiState())
    private  set

    fun updateEmail(email:String){
        uiState = uiState.copy(email=email)
    }

    fun updatePassword(password:String){
        uiState = uiState.copy(password=password)
    }

    fun login(){
        viewModelScope.launch {
            uiState = uiState.copy(isLoading = true,
                error = null)
            val result = repository.login(uiState.email,uiState.password)
            uiState = if(result.isSuccess){
                Log.d("Result",result.getOrNull().toString())
                uiState.copy(
                    isLoading = false,
                    token = result.getOrNull()?.token

                )
            }else{
                Log.d("Result Error",result.exceptionOrNull()?.message.toString())
                uiState.copy(
                    isLoading = false,
                    error = result.exceptionOrNull()?.message
                )
            }


        }

    }
}
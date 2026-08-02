package com.example.markety.features.auth.data.repository

import android.util.Log
import com.example.markety.API.RetrofitInstance
import com.example.markety.features.auth.data.model.LoginRequest
import com.example.markety.features.auth.data.model.LoginResponse
import com.example.markety.features.auth.data.remote.AuthApi
import retrofit2.Retrofit

class AuthRepository {
    suspend fun login(
        email: String,
        password: String
    ): Result<LoginResponse> {
        return try {
            val response = RetrofitInstance.api.login(
                LoginRequest(email, password)
            )
            if (response.isSuccessful && response.body() != null) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception("Login failed"))
            }
        } catch (e: Exception) {
            Log.d("Result Exception",e.stackTraceToString())
            Result.failure(e)
        }
    }
}
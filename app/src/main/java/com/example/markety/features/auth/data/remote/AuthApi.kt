package com.example.markety.features.auth.data.remote

import com.example.markety.features.auth.data.model.LoginRequest
import com.example.markety.features.auth.data.model.LoginResponse
import com.example.markety.features.auth.data.model.RegisterRequest
import com.example.markety.features.auth.data.model.RegisterResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST


interface AuthApi {
    @POST("api/v1/auth/signin")
    suspend fun login(
        @Body request: LoginRequest
    ): Response<LoginResponse>

    @POST("api/v1/auth/signup")
    suspend fun register(
        @Body request: RegisterRequest
    ): Response<RegisterResponse>
}

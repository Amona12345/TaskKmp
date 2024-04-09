package com.example.taskkmp.data.remote

import com.example.taskkmp.domain.entity.CategoryResponse
import retrofit2.http.GET

interface ApiServices {
    @GET("categories.php") //EndPoint
    suspend fun getMeales(): CategoryResponse
}
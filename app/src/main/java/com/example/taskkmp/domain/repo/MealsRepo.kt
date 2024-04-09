package com.example.taskkmp.domain.repo

import com.example.taskkmp.domain.entity.CategoryResponse

interface MealsRepo {
     suspend fun getMealzFromRemote():CategoryResponse
}
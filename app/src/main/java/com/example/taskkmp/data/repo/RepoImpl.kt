package com.example.taskkmp.data.repo

import com.example.taskkmp.data.remote.ApiServices
import com.example.taskkmp.domain.entity.CategoryResponse
import com.example.taskkmp.domain.repo.MealsRepo

class RepoImpl(val apiServices:ApiServices):MealsRepo {

    override suspend fun getMealzFromRemote(): CategoryResponse =apiServices.getMeales()
}

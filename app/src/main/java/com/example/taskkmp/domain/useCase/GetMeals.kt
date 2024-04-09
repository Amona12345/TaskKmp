package com.example.taskkmp.domain.useCase

import com.example.taskkmp.domain.repo.MealsRepo

class GetMeals(val repo:MealsRepo) {
    suspend operator fun   invoke()=repo.getMealzFromRemote()
}
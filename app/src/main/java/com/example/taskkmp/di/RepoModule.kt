package com.example.taskkmp.di

import com.example.taskkmp.data.remote.ApiServices
import com.example.taskkmp.data.repo.RepoImpl
import com.example.taskkmp.domain.repo.MealsRepo
import com.example.taskkmp.domain.useCase.GetMeals
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @Provides
    fun privideRepo(apiServices: ApiServices): MealsRepo {
        return RepoImpl(apiServices)
    }
}
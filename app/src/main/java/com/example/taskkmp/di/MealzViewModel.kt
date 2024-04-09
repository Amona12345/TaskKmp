package com.example.taskkmp.di

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.taskkmp.domain.entity.CategoryResponse
import com.example.taskkmp.domain.useCase.GetMeals
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MealzViewModel @Inject constructor(
    private val getMeals: GetMeals
):ViewModel(){
    private val _categories : MutableStateFlow<CategoryResponse?> = MutableStateFlow(null)
    fun getMeals(){
        try {
            viewModelScope.launch {
                _categories.value= getMeals.invoke()
            }

        } catch (e:Exception){
            Log.e("MealsViewModel", e.message.toString() )
        }

    }



}
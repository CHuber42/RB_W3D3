package com.example.firstkotlinproject.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firstkotlinproject.model.Joke
import com.example.firstkotlinproject.repo.JokeRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainViewModel : ViewModel() {

    private val _apiResponse = MutableLiveData<List<Joke>>()

    val apiResponse: LiveData<List<Joke>>
        get() = _apiResponse

    fun performApiCall(category: String){
        viewModelScope.launch(Dispatchers.Main){
            val jokeList = JokeRepo.getJokes(category)
            _apiResponse.value = jokeList
        }
    }

}
package com.example.firstkotlinproject.repo

import com.example.firstkotlinproject.model.Joke
import com.example.firstkotlinproject.repo.remote.RetrofitInstance

object JokeRepo {

    val jokeService = RetrofitInstance.jokeService

    suspend fun getJokes(category: String) : List<Joke> {
        return RetrofitInstance.jokeService.getJokeCoroutines(category, 10)
    }

}
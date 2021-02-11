package com.example.firstkotlinproject.repo.remote

import com.example.firstkotlinproject.model.Joke
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface JokeService {

    @GET("/joke/{category}")
    suspend fun getJokeCoroutines(
        @Path("category") category: String,
        @Query("amount") count: Int
    ) : List<Joke>
}
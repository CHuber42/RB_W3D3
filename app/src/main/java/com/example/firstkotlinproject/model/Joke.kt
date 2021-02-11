package com.example.firstkotlinproject.model

import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class Joke(
    val category: Boolean,
    val joke: String,
    val id: Int
)


package com.example.movielist

import com.google.gson.annotations.SerializedName

data class MovieApiResponse(
    @SerializedName("results") val results: List<Movie>
)
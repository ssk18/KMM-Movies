package com.ssk.movieapp.data

@kotlinx.serialization.Serializable
internal data class MoviesResponse(
    val results: List<MovieRemote>
)
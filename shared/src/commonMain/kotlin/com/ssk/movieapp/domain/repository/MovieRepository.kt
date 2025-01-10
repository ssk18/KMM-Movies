package com.ssk.movieapp.domain.repository

import com.ssk.movieapp.domain.model.Movie

interface MovieRepository {

    suspend fun getMovies(page: Int): List<Movie>

    suspend fun getMovie(movieId: Int): Movie

}
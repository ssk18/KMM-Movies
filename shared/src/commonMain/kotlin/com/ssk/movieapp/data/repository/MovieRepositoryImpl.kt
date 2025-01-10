package com.ssk.movieapp.data.repository

import com.ssk.movieapp.data.remote.RemoteDataSource
import com.ssk.movieapp.data.util.toMovie
import com.ssk.movieapp.domain.model.Movie
import com.ssk.movieapp.domain.repository.MovieRepository

internal class MovieRepositoryImpl(
    private val remoteDataSource: RemoteDataSource
): MovieRepository {
    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDataSource.getMovies(page).results.map { it.toMovie() }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDataSource.getMovie(movieId).toMovie()
    }
}
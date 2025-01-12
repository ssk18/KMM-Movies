package com.ssk.movieapp.android.home

import com.ssk.movieapp.domain.model.Movie

data class HomeScreenState(
    val loading: Boolean = false,
    val isRefreshing: Boolean = false,
    val movies: List<Movie> = emptyList(),
    val errorMessage: String? = null,
    val loadFinished: Boolean = false,
)

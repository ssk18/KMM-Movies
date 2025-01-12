package com.ssk.movieapp.android.home

import androidx.lifecycle.ViewModel
import com.ssk.movieapp.data.usecase.GetMoviesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel(
    val getMoviesUseCase: GetMoviesUseCase
): ViewModel() {

    private val _state = MutableStateFlow(HomeScreenState())
    val state = _state.asStateFlow()

}
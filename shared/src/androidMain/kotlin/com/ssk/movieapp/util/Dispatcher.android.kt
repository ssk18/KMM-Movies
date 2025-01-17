package com.ssk.movieapp.util

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

internal class AndroidDispatcher: Dispatcher {
    override val io: CoroutineDispatcher
        get() = Dispatchers.IO

}

internal actual fun provideDispatcher(): Dispatcher {
    return AndroidDispatcher()
}
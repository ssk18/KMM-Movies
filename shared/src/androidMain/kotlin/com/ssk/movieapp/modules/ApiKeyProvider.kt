package com.ssk.movieapp.modules

import com.ssk.movieapp.BuildConfig

actual class ApiKeyProvider actual constructor(){
    actual fun getApiKey(): String {
        return BuildConfig.API_KEY
    }
}
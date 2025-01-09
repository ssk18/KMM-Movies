package com.ssk.movieapp.modules

import platform.Foundation.NSBundle

actual class ApiKeyProvider actual constructor(){
    actual fun getApiKey(): String {
        val apiKey =  NSBundle.mainBundle.infoDictionary?.get("API_KEY") as String ?: ""
        println("iOS API Key: $apiKey")
        return apiKey
    }
}
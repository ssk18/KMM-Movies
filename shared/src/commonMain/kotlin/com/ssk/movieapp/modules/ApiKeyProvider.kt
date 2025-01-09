package com.ssk.movieapp.modules

expect class ApiKeyProvider constructor(){
    fun getApiKey(): String
}
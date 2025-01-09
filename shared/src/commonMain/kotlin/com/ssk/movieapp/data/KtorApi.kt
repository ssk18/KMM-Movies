package com.ssk.movieapp.data

import com.ssk.movieapp.modules.ApiKeyProvider
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.parameter
import io.ktor.http.path
import io.ktor.http.takeFrom
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

internal abstract class KtorApi {

    private val api_key = ApiKeyProvider().getApiKey()

    val client = HttpClient {
        install(ContentNegotiation) {
            json(
                Json {
                    ignoreUnknownKeys = true
                    useAlternativeNames = false
                }
            )
        }
    }

    fun HttpRequestBuilder.pathUrl(path: String) {
        url {
            takeFrom(BASE_URL)
            path(API_VERSION,path)
            parameter("api_key", api_key)
        }
    }

    companion object {
        private const val BASE_URL = "https://api.themoviedb.org/"  // Move to companion object
        private const val API_VERSION = "3"  // Extract API version
    }
}
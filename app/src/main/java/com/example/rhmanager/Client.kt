package com.example.rhmanager

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.http.ContentType.Application.Json

import io.ktor.client.HttpClient
import io.ktor.client.features.*
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.*
import io.ktor.http.*


private val okHttpKtor = HttpClient(CIO) {
    install(JsonFeature) {
        serializer = KotlinxSerializer()
    }

    defaultRequest {
//        parameter("Accept", "application/json")
//        parameter("Content-Type", "application/json; charset=\"UTF-8\"")
        header("Authorization", "Bearer "+BuildConfig.API_KEY)
        url {
            protocol = URLProtocol.HTTPS
            host = "api.robinhood.com"
//            encodedPath = "$basePath$encodedPath"
        }
    }
}
val client = okHttpKtor
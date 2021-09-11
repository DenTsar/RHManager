package com.example.rhmanager

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.http.ContentType.Application.Json

import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.features.*
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.features.observer.ResponseObserver
import io.ktor.client.request.*
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders


private val okHttpKtor = HttpClient(CIO) {
    install(JsonFeature) {
        serializer = KotlinxSerializer()
    }

    defaultRequest {
        parameter("Accept", "application/json")
        parameter("Content-Type", "application/json; charset=\"UTF-8\"");
        parameter("Authorization", "Bearer ");
    }
}
val client = okHttpKtor
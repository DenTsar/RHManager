package com.example.rhmanager.responses

import kotlinx.serialization.Serializable

@Serializable
data class Page<T>(
    val next: String?,
    val previous: String?,
    val results: List<T>
)

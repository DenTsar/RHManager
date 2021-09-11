package com.example.rhmanager.responses

import kotlinx.serialization.Serializable

@Serializable
data class Currency(
    val brand_color: String,
    val code: String,
    val id: String,
    val increment: String,
    val name: String,
    val type: String
)
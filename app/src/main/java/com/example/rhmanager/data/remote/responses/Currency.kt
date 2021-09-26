package com.example.rhmanager.data.remote.responses

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Currency(
    @SerialName("brand_color")
    val brandColor: String,
    val code: String,
    val id: String,
    val increment: String,
    val name: String,
    val type: String
)
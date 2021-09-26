package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CryptoExecution(
    @SerialName("effective_price")
    val effectivePrice: String,
    val id: String,
    val quantity: String,
    val timestamp: String
)
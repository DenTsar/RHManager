package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DataPoint(
    @SerialName("begins_at")
    val beginsAt: String,
    @SerialName("close_price")
    val closePrice: String,
    @SerialName("high_price")
    val highPrice: String,
    val interpolated: Boolean,
    @SerialName("low_price")
    val lowPrice: String,
    @SerialName("open_price")
    val openPrice: String,
    val session: String,
    val volume: Int
)
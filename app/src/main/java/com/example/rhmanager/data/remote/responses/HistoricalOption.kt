package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HistoricalOption(
    val bounds: String,
    @SerialName("data_points")
    val dataPoints: List<DataPoint>,
    val id: String,
    val instrument: String,
    val interval: String,
    @SerialName("occ_symbol")
    val occSymbol: String,
    @SerialName("open_price")
    val openPrice: String,
    @SerialName("open_time")
    val openTime: String,
    @SerialName("previous_close_price")
    val previousClosePrice: String,
    @SerialName("previous_close_time")
    val previousCloseTime: String,
    val span: String,
    val symbol: String
)
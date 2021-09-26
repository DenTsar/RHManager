package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OptionPosition(
    val account: String,
    @SerialName("average_open_price")
    val averageOpenPrice: String,
    val chain: String,
    @SerialName("created_at")
    val createdAt: String,
    val direction: String,
    val id: String,
    @SerialName("intraday_average_open_price")
    val intradayAverageOpenPrice: String,
    @SerialName("intraday_direction")
    val intradayDirection: String,
    @SerialName("intraday_quantity")
    val intradayQuantity: String,
    val legs: List<Leg>,
    val quantity: String,
    val strategy: String,
    @SerialName("strategy_code")
    val strategyCode: String,
    val symbol: String,
    @SerialName("trade_value_multiplier")
    val tradeValueMultiplier: String,
    @SerialName("updated_at")
    val updatedAt: String
)
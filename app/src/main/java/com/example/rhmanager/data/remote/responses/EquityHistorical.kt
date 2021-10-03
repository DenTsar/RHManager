package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EquityHistorical(
    @SerialName("adjusted_close_equity")
    val adjustedCloseEquity: String,
    @SerialName("adjusted_open_equity")
    val adjustedOpenEquity: String,
    @SerialName("begins_at")
    val beginsAt: String,
    @SerialName("close_equity")
    val closeEquity: String,
    @SerialName("close_market_value")
    val closeMarketValue: String,
    @SerialName("net_return")
    val netReturn: String,
    @SerialName("open_equity")
    val openEquity: String,
    @SerialName("open_market_value")
    val openMarketValue: String,
    val session: String
)
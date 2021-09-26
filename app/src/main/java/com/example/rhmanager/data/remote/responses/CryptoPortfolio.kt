package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CryptoPortfolio(
    @SerialName("account_id")
    val accountId: String,
    val equity: String,
    @SerialName("extended_hours_equity")
    val extendedHoursEquity: String,
    @SerialName("extended_hours_market_value")
    val extendedHoursMarketValue: String,
    val id: String,
    @SerialName("market_value")
    val marketValue: String,
    @SerialName("previous_close")
    val previousClose: String,
    @SerialName("updated_at")
    val updatedAt: String
)
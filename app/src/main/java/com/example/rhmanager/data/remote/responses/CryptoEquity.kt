package com.example.rhmanager.data.remote.responses

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CryptoEquity(
    val equity: Equity,
    @SerialName("market_value")
    val marketValue: Equity,
    @SerialName("opened_at")
    val openedAt: String,
)
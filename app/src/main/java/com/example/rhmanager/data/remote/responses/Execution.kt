package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Execution(
    val id: String,
    @SerialName("ipo_access_execution_rank")
    val ipoAccessExecutionRank: String?,
    val price: String,
    val quantity: String,
    @SerialName("rounded_notional")
    val roundedNotional: String,
    @SerialName("settlement_date")
    val settlementDate: String,
    val timestamp: String
)
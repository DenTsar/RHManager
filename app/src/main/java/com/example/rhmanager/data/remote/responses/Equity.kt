package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Equity(
    val amount: String,
    @SerialName("currency_code")
    val currencyCode: String,
    @SerialName("currency_id")
    val currencyId: String
)
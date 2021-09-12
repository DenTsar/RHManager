package com.example.rhmanager.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Notional(
    val amount: String,
    @SerialName("currency_code")
    val currencyCode: String,
    @SerialName("currency_id")
    val currencyId: String
)
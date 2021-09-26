package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OptionChain(
    @SerialName("can_open_position")
    val canOpenPosition: Boolean,
    @SerialName("cash_component")
    val cashComponent: String?,
    @SerialName("expiration_dates")
    val expirationDates: List<String>,
    val id: String,
    @SerialName("min_ticks")
    val minTicks: MinTicks,
    val symbol: String,
    @SerialName("trade_value_multiplier")
    val tradeValueMultiplier: String,
    @SerialName("underlying_instruments")
    val underlyingInstruments: List<UnderlyingInstrument>
)
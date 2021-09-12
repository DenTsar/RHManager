package com.example.rhmanager.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Leg(
    @SerialName("expiration_date")
    val expirationDate: String,
    val id: String,
    val option: String,
    @SerialName("option_type")
    val optionType: String,
    val position: String,
    @SerialName("position_type")
    val positionType: String,
    @SerialName("ratio_quantity")
    val ratioQuantity: Int,
    @SerialName("strike_price")
    val strikePrice: String
)
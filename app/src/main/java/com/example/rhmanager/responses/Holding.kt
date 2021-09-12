package com.example.rhmanager.responses

import com.example.rhmanager.responses.CostBase
import com.example.rhmanager.responses.Currency
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Holding(
    @SerialName("account_id")
    val accountId: String,
    @SerialName("cost_bases")
    val costBases: List<CostBase>,
    @SerialName("created_at")
    val createdAt: String,
    val currency: Currency,
    val id: String,
    val quantity: String,
    @SerialName("quantity_available")
    val quantityAvailable: String,
    @SerialName("quantity_held_for_buy")
    val quantityHeldForBuy: String,
    @SerialName("quantity_held_for_sell")
    val quantityHeldForSell: String,
    val updated_at: String
)
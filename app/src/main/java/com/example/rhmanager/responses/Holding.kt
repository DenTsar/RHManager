package com.example.rhmanager.responses

import com.example.rhmanager.responses.CostBase
import com.example.rhmanager.responses.Currency
import kotlinx.serialization.Serializable

@Serializable
data class Holding(
    val account_id: String,
    val cost_bases: List<CostBase>,
    val created_at: String,
    val currency: Currency,
    val id: String,
    val quantity: String,
    val quantity_available: String,
    val quantity_held_for_buy: String,
    val quantity_held_for_sell: String,
    val updated_at: String
)
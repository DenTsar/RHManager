package com.example.rhmanager.responses

import kotlinx.serialization.Serializable

@Serializable
data class CostBase(
    val currency_id: String,
    val direct_cost_basis: String,
    val direct_quantity: String,
    val id: String,
    val intraday_cost_basis: String,
    val intraday_quantity: String,
    val marked_cost_basis: String,
    val marked_quantity: String
)
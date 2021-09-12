package com.example.rhmanager.responses

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CostBase(
    @SerialName("currency_id")
    val currencyId: String,
    @SerialName("direct_cost_basis")
    val directCostBasis: String,
    @SerialName("direct_quantity")
    val directQuantity: String,
    val id: String,
    @SerialName("intraday_cost_basis")
    val intradayCostBasis: String,
    @SerialName("intraday_quantity")
    val intradayQuantity: String,
    @SerialName("marked_cost_basis")
    val markedCosBasis: String,
    @SerialName("marked_quantity")
    val markedQuantity: String
)
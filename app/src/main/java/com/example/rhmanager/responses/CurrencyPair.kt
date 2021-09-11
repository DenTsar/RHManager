package com.example.rhmanager.responses

import kotlinx.serialization.Serializable

@Serializable
data class CurrencyPair(
    val asset_currency: Currency,
    val display_only: Boolean,
    val id: String,
    val max_order_size: String,
    val min_order_price_increment: String,
    val min_order_quantity_increment: String,
    val min_order_size: String,
    val name: String,
    val quote_currency: Currency,
    val symbol: String,
    val tradability: String
)
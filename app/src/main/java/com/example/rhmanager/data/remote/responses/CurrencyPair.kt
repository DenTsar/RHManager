package com.example.rhmanager.data.remote.responses

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CurrencyPair(
    @SerialName("asset_currency")
    val assetCurrency: Currency,
    val displayOnly: Boolean,
    val id: String,
    @SerialName("max_order_size")
    val maxOrderSize: String,
    @SerialName("min_order_price_increment")
    val minOrderPriceIncrement: String,
    @SerialName("min_order_quantity_increment")
    val minOrderQuantityIncrement: String,
    @SerialName("min_order_size")
    val minOrderSize: String,
    val name: String,
    @SerialName("quote_currency")
    val quoteCurrency: Currency,
    val symbol: String,
    val tradability: String
)
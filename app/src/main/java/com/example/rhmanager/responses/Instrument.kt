package com.example.rhmanager.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Instrument(
    @SerialName("bloomberg_unique")
    val bloombergUnique: String,
    val country: String,
    @SerialName("day_trade_ratio")
    val dayTradeRatio: String,
    @SerialName("default_collar_fraction")
    val defaultCollarFraction: String,
    @SerialName("fractional_tradability")
    val fractionalTradability: String,
    val fundamentals: String,
    val id: String,
    @SerialName("ipo_access_cob_deadline")
    val ipoAccessCobDeadline: String?,
    @SerialName("ipo_access_status")
    val ipoAccessStatus: String?,
    @SerialName("ipo_allocated_price")
    val ipoAllocatedPrice: String?,
    @SerialName("ipo_customers_received")
    val ipoCustomersReceived: String?,
    @SerialName("ipo_customers_requested")
    val ipoCustomersRequested: String?,
    @SerialName("ipo_date")
    val ipoDate: String?,
    @SerialName("ipo_roadshow_url")
    val ipoRoadshowUrl: String?,
    @SerialName("ipo_s1_url")
    val ipoS1Url: String?,
    @SerialName("is_spac")
    val isSpac: Boolean,
    @SerialName("is_test")
    val isTest: Boolean,
    @SerialName("list_date")
    val listDate: String,
    @SerialName("maintenance_ratio")
    val maintenanceRatio: String,
    @SerialName("margin_initial_ratio")
    val marginInitialRatio: String,
    val market: String,
    @SerialName("min_tick_size")
    val minTickSize: String?,
    val name: String,
    val quote: String,
    @SerialName("rhs_tradability")
    val rhsTradability: String,
    @SerialName("simple_name")
    val simpleName: String,
    val splits: String,
    val state: String,
    val symbol: String,
    val tradability: String,
    @SerialName("tradable_chain_id")
    val tradableChainId: String,
    val tradeable: Boolean,
    val type: String,
    val url: String
)
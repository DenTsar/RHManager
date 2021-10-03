package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StockOrder(
    val account: String,
    @SerialName("average_price")
    val averagePrice: String,
    val cancel: String?,
    @SerialName("created_at")
    val createdAt: String,
    @SerialName("cumulative_quantity")
    val cumulativeQuantity: String,
    @SerialName("dollar_based_amount")
    val dollarBasedAmount: Equity?,
    @SerialName("executed_notional")
    val executedNotional: Equity?,
    val executions: List<Execution>,
    @SerialName("extended_hours")
    val extendedHours: Boolean,
    val fees: String,
    @SerialName("has_ipo_access_custom_price_limit")
    val hasIpoAccessCustomPriceLimit: Boolean,
    val id: String,
    val instrument: String,
    @SerialName("instrument_id")
    val instrumentId: String,
    @SerialName("investment_schedule_id")
    val investmentScheduleId: String?,
    @SerialName("ipo_access_cancellation_reason")
    val ipoAccessCancellationReason: String?,
    @SerialName("ipo_access_lower_collared_price")
    val ipoAccessLowerCollaredPrice: String?,
    @SerialName("ipo_access_lower_price")
    val ipoAccessLowerPrice: String?,
    @SerialName("ipo_access_upper_collared_price")
    val ipoAccessUpperCollaredPrice: String?,
    @SerialName("ipo_access_upper_price")
    val ipoAccessUpperPrice: String?,
    @SerialName("is_ipo_access_order")
    val isIpoAccessOrder: Boolean,
    @SerialName("is_ipo_access_price_finalized")
    val isIpoAccessPriceFinalized: Boolean,
    @SerialName("last_trail_price")
    val lastTrailPrice: String?,
    @SerialName("last_trail_price_updated_at")
    val lastTrailPriceUpdatedAt: String?,
    @SerialName("last_transaction_at")
    val lastTransactionAt: String,
    @SerialName("override_day_trade_checks")
    val overrideDayTradeChecks: Boolean,
    @SerialName("override_dtbp_checks")
    val overrideDtbpChecks: Boolean,
    @SerialName("pending_cancel_open_agent")
    val pendingCancelOpenAgent: String?,
    val position: String,
    val price: String,
    val quantity: String,
    @SerialName("ref_id")
    val refId: String?,
    @SerialName("reject_reason")
    val rejectReason: String?,
    @SerialName("response_category")
    val responseCategory: String?,
    val side: String,
    val state: String,
    @SerialName("stop_price")
    val stopPrice: String?,
    @SerialName("stop_triggered_at")
    val stopTriggeredAt: String?,
    @SerialName("time_in_force")
    val timeInForce: String,
    @SerialName("total_notional")
    val totalNotional: Equity,
    val trigger: String,
    val type: String,
    @SerialName("updated_at")
    val updatedAt: String,
    val url: String
)
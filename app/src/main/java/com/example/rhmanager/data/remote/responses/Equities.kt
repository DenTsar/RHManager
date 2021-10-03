package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Equities(
    @SerialName("active_subscription_id")
    val activeSubscriptionId: String?,
    @SerialName("apex_account_number")
    val apexAccountNumber: String?,
    @SerialName("available_margin")
    val availableMargin: String?,
    val equity: Equity,
    @SerialName("margin_maintenance")
    val marginMaintenance: Equity,
    @SerialName("market_value")
    val marketValue: Equity,
    @SerialName("opened_at")
    val openedAt: String,
    @SerialName("rhs_account_number")
    val rhsAccountNumber: String,
    @SerialName("total_margin")
    val totalMargin: Equity
)
package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CryptoOrder(
    @SerialName("account_id")
    val accountId: String,
    @SerialName("average_price")
    val averagePrice: String?,
    @SerialName("cancel_url")
    val cancelUrl: String?,
    @SerialName("created_at")
    val createdAt: String,
    @SerialName("cumulative_quantity")
    val cumulativeQuantity: String,
    @SerialName("currency_pair_id")
    val currencyPairId: String,
    @SerialName("entered_price")
    val enteredPrice: String,
    val executions: List<CryptoExecution>,
    val id: String,
    @SerialName("initiator_id")
    val initiatorId: String?,
    @SerialName("initiator_type")
    val initiatorType: String?,
    @SerialName("last_transaction_at")
    val lastTransactionAt: String,
    val price: String,
    val quantity: String,
    @SerialName("ref_id")
    val refId: String,
    @SerialName("rounded_executed_notional")
    val roundedExecutedNotional: String,
    val side: String,
    val state: String,
    @SerialName("time_in_force")
    val timeInForce: String,
    val type: String,
    @SerialName("updated_at")
    val updatedAt: String
)
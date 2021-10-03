package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CryptoAccount(
    @SerialName("apex_account_number")
    val apexAccountNumber: String,
    @SerialName("created_at")
    val createdAt: String,
    val id: String,
    @SerialName("rhs_account_number")
    val rhsAccountNumber: String,
    val status: String,
    @SerialName("status_reason_code")
    val statusReasonCode: String,
    @SerialName("updated_at")
    val updatedAt: String,
    @SerialName("user_id")
    val userId: String
)
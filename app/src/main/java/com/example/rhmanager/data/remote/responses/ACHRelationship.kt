package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ACHRelationship(
    val account: String,
    @SerialName("bank_account_holder_name")
    val bankAccountHolderName: String,
    @SerialName("bank_account_nickname")
    val bankAccountNickname: String,
    @SerialName("bank_account_number")
    val bankAccountNumber: String,
    @SerialName("bank_account_type")
    val bankAccountType: String,
    @SerialName("bank_routing_number")
    val bankRoutingNumber: String,
    @SerialName("created_at")
    val createdAt: String,
    @SerialName("document_request")
    val documentRequest: String?,
    @SerialName("first_created_at")
    val firstCreatedAt: String,
    val id: String,
    @SerialName("initial_deposit")
    val initialDeposit: String,
    val state: String,
    val unlink: String,
    @SerialName("unlinked_at")
    val unlinkedAt: String,
    val url: String,
    @SerialName("verification_method")
    val verificationMethod: String,
    val verified: Boolean,
    @SerialName("verify_micro_deposits")
    val verifyMicroDeposits: String?,
    @SerialName("withdrawal_limit")
    val withdrawalLimit: String
)
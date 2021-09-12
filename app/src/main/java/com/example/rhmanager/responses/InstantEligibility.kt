package com.example.rhmanager.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InstantEligibility(
    @SerialName("additional_deposit_needed")
    val additionalDepositNeeded: String,
    @SerialName("compliance_user_major_oak_email")
    val complianceUserMajorOakEmail: String,
    @SerialName("created_at")
    val createdAt: String,
    @SerialName("created_by")
    val createdBy: String,
    val reason: String,
    @SerialName("reinstatement_date")
    val reinstatementDate: String?,
    val reversal: String,
    val state: String,
    @SerialName("updated_at")
    val updatedAt: String
)
package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ACHTransfer(
    val account: String,
    @SerialName("ach_relationship")
    val achRelationship: String,
    val amount: String,
    val cancel: String?,
    @SerialName("created_at")
    val createdAt: String,
    val direction: String,
    @SerialName("early_access_amount")
    val earlyAccessAmount: String,
    @SerialName("expected_landing_date")
    val expectedLandingDate: String,
    @SerialName("expected_landing_datetime")
    val expectedLandingDatetime: String,
    @SerialName("expected_sweep_at")
    val expectedSweepAt: String?,
    val fees: String,
    val id: String,
    @SerialName("investment_schedule_id")
    val investmentScheduleId: String?,
    @SerialName("ref_id")
    val refId: String,
    @SerialName("rhs_state")
    val rhsState: String,
    val scheduled: Boolean,
    val state: String,
    @SerialName("status_description")
    val statusDescription: String,
    @SerialName("updated_at")
    val updatedAt: String,
    val url: String
)
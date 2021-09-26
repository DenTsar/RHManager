package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MinTicks(
    @SerialName("above_tick")
    val aboveTick: String,
    @SerialName("below_tick")
    val belowTick: String,
    @SerialName("cutoff_price")
    val cutoffPrice: String
)
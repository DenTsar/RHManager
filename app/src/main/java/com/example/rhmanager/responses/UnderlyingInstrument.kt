package com.example.rhmanager.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UnderlyingInstrument(
    val id: String,
    val instrument: String,
    val quantity: Int
)
package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.Serializable

@Serializable
data class UnderlyingInstrument(
    val id: String,
    val instrument: String,
    val quantity: Int
)
package com.example.rhmanager.responses

import kotlinx.serialization.Serializable


val currencyPairList = mutableListOf<CurrencyPair>()

@Serializable
data class CurrencyPair(
    val next: String?,
    val previous: String?,
    val results: List<Result>
)
package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HistoricalPortfolio(
    @SerialName("adjusted_open_equity")
    val adjustedOpenEquity: String,
    @SerialName("adjusted_previous_close_equity")
    val adjustedPreviousCloseEquity: String,
    val bounds: String,
    @SerialName("equity_historicals")
    val equityHistoricals: List<EquityHistorical>,
    val interval: String,
    @SerialName("open_equity")
    val openEquity: String,
    @SerialName("open_time")
    val openTime: String,
    @SerialName("previous_close_equity")
    val previousCloseEquity: String,
    val span: String,
    @SerialName("total_return")
    val totalReturn: String,
    @SerialName("use_new_hp")
    val useNewHp: Boolean
)
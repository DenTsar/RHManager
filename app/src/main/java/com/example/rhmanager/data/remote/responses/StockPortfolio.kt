package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StockPortfolio(
    val account: String,
    @SerialName("adjusted_equity_previous_close")
    val adjustedEquityPreviousClose: String,
    @SerialName("adjusted_portfolio_equity_previous_close")
    val adjustedPortfolioEquityPreviousClose: String,
    val equity: String,
    @SerialName("equity_previous_close")
    val equityPreviousClose: String,
    @SerialName("excess_maintenance")
    val excessMaintenance: String,
    @SerialName("excess_maintenance_with_uncleared_deposits")
    val excessMaintenanceWithUnclearedDeposits: String,
    @SerialName("excess_margin")
    val excessMargin: String,
    @SerialName("excess_margin_with_uncleared_deposits")
    val excessMarginWithUnclearedDeposits: String,
    @SerialName("extended_hours_equity")
    val extendedHoursEquity: String,
    @SerialName("extended_hours_market_value")
    val extendedHoursMarketValue: String,
    @SerialName("extended_hours_portfolio_equity")
    val extendedHoursPortfolioEquity: String,
    @SerialName("last_core_equity")
    val lastCoreEquity: String,
    @SerialName("last_core_market_value")
    val lastCoreMarketValue: String,
    @SerialName("last_core_portfolio_equity")
    val lastCorePortfolioEquity: String,
    @SerialName("market_value")
    val marketValue: String,
    @SerialName("portfolio_equity_previous_close")
    val portfolioEquityPreviousClose: String,
    @SerialName("start_date")
    val startDate: String,
    @SerialName("unwithdrawable_deposits")
    val unwithdrawableDeposits: String,
    @SerialName("unwithdrawable_grants")
    val unwithdrawableGrants: String,
    val url: String,
    @SerialName("withdrawable_amount")
    val withdrawableAmount: String
)
package com.example.rhmanager.data.remote.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AccountEquities(
    @SerialName("account_buying_power")
    val accountBuyingPower: Equity,
    @SerialName("cash_available_from_instant_deposits")
    val cashAvailableFromInstantDeposits: Equity,
    @SerialName("cash_held_for_currency_orders")
    val cashHeldForCurrencyOrders: Equity,
    @SerialName("cash_held_for_dividends")
    val cashHeldForDividends: Equity,
    @SerialName("cash_held_for_equity_orders")
    val cashHeldForEquityOrders: Equity,
    @SerialName("cash_held_for_options_collateral")
    val cashHeldForOptionsCollateral: Equity,
    @SerialName("cash_held_for_orders")
    val cashHeldForOrders: Equity,
    val crypto: Equity,
    @SerialName("crypto_buying_power")
    val value: Equity,
    val equities: Equities,
    @SerialName("extended_hours_portfolio_equity")
    val extendedHoursPortfolioEquity: Equity,
    @SerialName("instant_allocated")
    val instantAllocated: Equity,
    @SerialName("levered_amount")
    val leveredAmount: Equity,
    @SerialName("near_margin_call")
    val nearMarginCall: Boolean,
    @SerialName("options_buying_power")
    val optionsBuyingPower: Equity,
    @SerialName("portfolio_equity")
    val portfolioEquity: Equity,
    @SerialName("portfolio_previous_close")
    val portfolioPreviousClose: Equity,
    @SerialName("previous_close")
    val previousClose: Equity,
    @SerialName("regular_hours_portfolio_equity")
    val regularHoursPortfolioEquity: Equity,
    @SerialName("total_equity")
    val totalEquity: Equity,
    @SerialName("total_extended_hours_equity")
    val totalExtendedHoursEquity: Equity,
    @SerialName("total_extended_hours_market_value")
    val totalExtendedHoursMarketValue: Equity,
    @SerialName("total_market_value")
    val totalMarketValue: Equity,
    @SerialName("total_regular_hours_equity")
    val totalRegularHoursEquity: Equity,
    @SerialName("total_regular_hours_market_value")
    val totalRegularHoursMarketValue: Equity,
    @SerialName("uninvested_cash")
    val uninvestedCash: Equity,
    @SerialName("withdrawable_cash")
    val withdrawableCash: Equity
)
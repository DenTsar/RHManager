package com.example.rhmanager.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.math.BigDecimal

@Serializable
data class MarginBalances(
    val cash: String,
    @SerialName("cash_available_for_withdrawal")
    val cashAvailableForWithdrawal: String,
    @SerialName("cash_held_for_crypto_orders")
    val cashHeldForCryptoOrders: String,
    @SerialName("cash_held_for_dividends")
    val cashHeldForDividends: String,
    @SerialName("cash_held_for_nummus_restrictions")
    val cashHeldForNummusRestrictions: String,
    @SerialName("cash_held_for_options_collateral")
    val cashHeldForOptionsCollateral: String,
    @SerialName("cash_held_for_orders")
    val cashHeldForOrders: String,
    @SerialName("cash_held_for_restrictions")
    val cashHeldForRestrictions: String,
    @SerialName("cash_pending_from_options_events")
    val cashPendingFromOptionsEvents: String,
    @SerialName("created_at")
    val createdAt: String,
    @SerialName("crypto_buying_power")
    val cryptoBuyingPower: String,
    @SerialName("day_trade_buying_power")
    val dayTradeBuyingPower: String,
    @SerialName("day_trade_buying_power_held_for_orders")
    val dayTradeBuyingPowerHeldForOrders: String,
    @SerialName("day_trade_ratio")
    val dayTradeRatio: String,
    @SerialName("day_trades_protection")
    val dayTradesProtection: Boolean,
    @SerialName("eligible_deposit_as_instant")
    val eligibleDepositAsInstant: String,
    @SerialName("funding_hold_balance")
    val fundingHoldBalance: String,
    @SerialName("gold_equity_requirement")
    val goldEquityRequirement: String,
    @SerialName("instant_allocated")
    val instantAllocated: String,
    @SerialName("instant_used")
    val instantUsed: String,
    @SerialName("leverage_enabled")
    val leverageEnabled: Boolean,
    @SerialName("margin_limit")
    val marginLimit: String,
    @SerialName("margin_withdrawal_limit")
    val marginWithdrawalLimit: String?,
    @SerialName("marked_pattern_day_trader_date")
    val markedPatternDayTraderDate: String?,
    @SerialName("net_moving_cash")
    val netMovingCash: String,
    @SerialName("outstanding_interest")
    val outstandingInterest: String,
    @SerialName("overnight_buying_power")
    val overnightBuyingPower: String,
    @SerialName("overnight_buying_power_held_for_orders")
    val overnightBuyingPowerHeldForOrders: String,
    @SerialName("overnight_ratio")
    val overnightRatio: String,
    @SerialName("pending_debit_card_debits")
    val pendingDebitCardDebits: String,
    @SerialName("pending_deposit")
    val pendingDeposit: String,
    @SerialName("portfolio_cash")
    val portfolioCash: String,
    @SerialName("settled_amount_borrowed")
    val settledAmountBorrowed: String,
    val sma: String,
    @SerialName("start_of_day_dtbp")
    val startOfDayDtbp: String,
    @SerialName("start_of_day_overnight_buying_power")
    val startOfDayOvernightBuyingPower: String,
    @SerialName("unallocated_margin_cash")
    val unallocatedMarginCash: String,
    @SerialName("uncleared_deposits")
    val unclearedDeposits: String,
    @SerialName("uncleared_nummus_deposits")
    val unclearedNummusDeposits: String,
    @SerialName("unsettled_debit")
    val unsettledDebit: String,
    @SerialName("unsettled_funds")
    val unsettledFunds: String,
    @SerialName("updated_at")
    val updatedAt: String
)
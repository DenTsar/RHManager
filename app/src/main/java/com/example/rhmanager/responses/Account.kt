package com.example.rhmanager.responses


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Account(
    @SerialName("account_number")
    val accountNumber: String,
    @SerialName("active_subscription_id")
    val activeSubscriptionId: String?,
    @SerialName("amount_eligible_for_deposit_cancellation")
    val amountEligibleForDepositCancellation: String,
    @SerialName("buying_power")
    val buyingPower: String,
    @SerialName("can_downgrade_to_cash")
    val canDowngradeToCash: String,
    val cash: String,
    @SerialName("cash_available_for_withdrawal")
    val cashAvailableForWithdrawal: String,
    @SerialName("cash_balances")
    val cashBalances: String?,
    @SerialName("cash_held_for_options_collateral")
    val cashHeldForOptionsCollateral: String,
    @SerialName("cash_held_for_orders")
    val cashHeldForOrders: String,
    @SerialName("cash_management_enabled")
    val cashManagementEnabled: Boolean,
    @SerialName("created_at")
    val createdAt: String,
    @SerialName("crypto_buying_power")
    val cryptoBuyingPower: String,
    val deactivated: Boolean,
    @SerialName("deposit_halted")
    val depositHalted: Boolean,
    @SerialName("drip_enabled")
    val dripEnabled: Boolean,
    @SerialName("eligible_for_cash_management")
    val eligibleForCashManagement: Boolean,
    @SerialName("eligible_for_drip")
    val eligibleForDrip: Boolean,
    @SerialName("eligible_for_fractionals")
    val eligibleForFractionals: Boolean,
    @SerialName("equity_trading_lock")
    val equityTradingLock: String,
    @SerialName("fractional_position_closing_only")
    val fractionalPositionClosingOnly: Boolean,
    @SerialName("instant_eligibility")
    val instantEligibility: InstantEligibility,
    @SerialName("is_pinnacle_account")
    val isPinnacleAccount: Boolean,
    val locked: Boolean,
    @SerialName("margin_balances")
    val marginBalances: MarginBalances,
    @SerialName("max_ach_early_access_amount")
    val maxAchEarlyAccessAmount: String,
    @SerialName("only_position_closing_trades")
    val onlyPositionClosingTrades: Boolean,
    @SerialName("option_level")
    val optionLevel: String,
    @SerialName("option_trading_lock")
    val optionTradingLock: String,
    @SerialName("option_trading_on_expiration_enabled")
    val optionTradingOnExpirationEnabled: Boolean,
    @SerialName("permanently_deactivated")
    val permanentlyDeactivated: Boolean,
    @SerialName("portfolio_cash")
    val portfolioCash: String,
    @SerialName("received_ach_debit_locked")
    val receivedAchDebitLocked: Boolean,
    @SerialName("rhs_account_number")
    val rhsAccountNumber: Int,
    @SerialName("rhs_stock_loan_consent_status")
    val rhsStockLoanConsentStatus: String,
    val sma: String,
    @SerialName("sma_held_for_orders")
    val smaHeldForOrders: String,
    val state: String,
    @SerialName("sweep_enabled")
    val sweepEnabled: Boolean,
    val type: String,
    @SerialName("uncleared_deposits")
    val unclearedDeposits: String,
    @SerialName("unsettled_debit")
    val unsettledDebit: String,
    @SerialName("unsettled_funds")
    val unsettledFunds: String,
    @SerialName("updated_at")
    val updatedAt: String,
    val url: String,
    val user: String,
    @SerialName("user_id")
    val userId: String,
    @SerialName("withdrawal_halted")
    val withdrawalHalted: Boolean
)
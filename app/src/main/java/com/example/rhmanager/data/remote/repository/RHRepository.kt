package com.example.rhmanager.data.remote.repository

import com.example.rhmanager.data.remote.responses.*

interface RHRepository {
    suspend fun getCryptoOrders() : Page<CryptoOrder>
    suspend fun getHistoricalCryptoData(
        id: String,
        bounds: String,
        interval: String,
        span: String
    ): HistoricalStockCrypto

    suspend fun getHistoricalPortfolioData(
        id: String,
        bounds: String,
        interval: String,
        span: String
    ): HistoricalPortfolio

    suspend fun getAccountEquities(): AccountEquities
}
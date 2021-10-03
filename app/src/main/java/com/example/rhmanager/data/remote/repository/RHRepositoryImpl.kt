package com.example.rhmanager.data.remote.repository

import com.example.rhmanager.client
import com.example.rhmanager.common.GENERAL_URL
import com.example.rhmanager.data.remote.responses.*
import io.ktor.client.request.*

class RHRepositoryImpl : RHRepository {
    override suspend fun getCryptoOrders(): Page<CryptoOrder> {
        return client.get("/orders")
    }
    override suspend fun getHistoricalCryptoData(id: String, bounds : String, interval : String, span : String) : HistoricalStockCrypto{
        return client.get("$GENERAL_URL/marketdata/forex/historicals/$id/?bounds=$bounds&interval=$interval&span=$span")
    }
    override suspend fun getHistoricalPortfolioData(id: String, bounds : String, interval : String, span : String) : HistoricalPortfolio{
        return client.get("$GENERAL_URL/portfolios/historicals/830462008/?bounds=$bounds&interval=$interval&span=d$span")
    }
    override suspend fun getAccountEquities() : AccountEquities{
        return client.get("https://bonfire.robinhood.com/phoenix/accounts/unified")
    }
}
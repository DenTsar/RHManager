package com.example.rhmanager.data.remote.repository

import com.example.rhmanager.client
import com.example.rhmanager.data.remote.responses.CryptoOrder
import com.example.rhmanager.data.remote.responses.HistoricalData
import com.example.rhmanager.data.remote.responses.Page
import io.ktor.client.request.*

class RHRepositoryImpl : RHRepository {
    override suspend fun getCryptoOrders(): Page<CryptoOrder> {
        return client.get("/orders")
    }
    override suspend fun getCryptoData() : HistoricalData{
        return client.get("/marketdata/forex/historicals/1ef78e1b-049b-4f12-90e5-555dcf2fe204/?bounds=24_7&interval=hour&span=month")
    }
}
package com.example.rhmanager.data.remote.repository

import android.util.Log
import com.example.rhmanager.client
import com.example.rhmanager.data.remote.responses.CryptoOrder
import com.example.rhmanager.data.remote.responses.HistoricalData
import com.example.rhmanager.data.remote.responses.Page
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.utils.io.*

class RHRepositoryImpl : RHRepository {
    override suspend fun getCryptoOrders(): Page<CryptoOrder> {
        return client.get("/orders")
    }
    override suspend fun getCryptoData(id: String, bounds : String, interval : String, span : String) : HistoricalData{
        return client.get("/marketdata/forex/historicals/$id/?bounds=$bounds&interval=$interval&span=$span")
    }
}
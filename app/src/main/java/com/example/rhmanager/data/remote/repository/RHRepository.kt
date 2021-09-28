package com.example.rhmanager.data.remote.repository

import com.example.rhmanager.data.remote.responses.CryptoOrder
import com.example.rhmanager.data.remote.responses.HistoricalData
import com.example.rhmanager.data.remote.responses.Page

interface RHRepository {
    suspend fun getCryptoOrders() : Page<CryptoOrder>
    suspend fun getCryptoData(): HistoricalData
}
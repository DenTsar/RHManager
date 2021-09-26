package com.example.rhmanager.data.remote.repository

import com.example.rhmanager.client
import com.example.rhmanager.data.remote.responses.CryptoOrder
import com.example.rhmanager.data.remote.responses.Page
import io.ktor.client.request.*

class RHApiImpl : RHApi {
    override suspend fun getCryptoOrders(): Page<CryptoOrder> {
        return client.get("/orders")
    }
}
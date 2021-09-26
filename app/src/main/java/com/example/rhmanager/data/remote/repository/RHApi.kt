package com.example.rhmanager.data.remote.repository

import com.example.rhmanager.data.remote.responses.CryptoOrder
import com.example.rhmanager.data.remote.responses.Page

interface RHApi {
    suspend fun getCryptoOrders() : Page<CryptoOrder>
}
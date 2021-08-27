package com.example.rhmanager

import android.app.Application
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.rhmanager.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class RHManagerApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@RHManagerApplication)
            modules(appModule)
        }
    }
}
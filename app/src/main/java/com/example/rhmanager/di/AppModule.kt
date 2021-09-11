package com.example.rhmanager.di

import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.rhmanager.TestViewModel
import com.example.rhmanager.repository.TestRepository
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel

val appModule = module {
    viewModel { TestViewModel() }
}

val repModule = module {
    single<TestRepository> {
        TestRepository()
    }
}
package com.example.rhmanager.di

import com.example.rhmanager.presentation.TestViewModel
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
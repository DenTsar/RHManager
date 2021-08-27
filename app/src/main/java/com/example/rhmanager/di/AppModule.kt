package com.example.rhmanager.di

import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.rhmanager.TestViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel

val appModule = module {
    viewModel { TestViewModel() }
}
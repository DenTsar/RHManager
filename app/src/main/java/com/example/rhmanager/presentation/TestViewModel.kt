package com.example.rhmanager.presentation

import android.util.Log
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rhmanager.common.Resource
import com.example.rhmanager.data.remote.repository.RHRepositoryImpl
import com.example.rhmanager.data.remote.responses.HistoricalData
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch


class TestViewModel : ViewModel(){
    private val _testState = MutableStateFlow<UIState>(UIState.Empty)
    val testState : StateFlow<UIState> = _testState
    val repository  = RHRepositoryImpl()

    val data : MutableState<Resource<HistoricalData>> = mutableStateOf(Resource.Loading())

    fun run(key : String){
        
    }
    
    sealed class UIState{
        object Success : UIState()
        object Error : UIState()
        object Loading : UIState()
        object Empty : UIState()
    }

    fun getCryptoData(): HistoricalData?{
        var b : HistoricalData? = null
        viewModelScope.launch {
            delay(5000)
            data.value = Resource.Success(repository.getCryptoData("1ef78e1b-049b-4f12-90e5-555dcf2fe204","24_7","hour","3months"))
            delay(10000)
            data.value = Resource.Success(repository.getCryptoData("1ef78e1b-049b-4f12-90e5-555dcf2fe204","24_7","hour","3months"))
            Log.d("qwery",data.value.data.toString())
        }
        Log.d("qwery",data.value.data.toString())
        return b
    }

//    fun categoriesList(): Flow<CryptoOrder> {
//        var list: MutableStateFlow<Any> = MutableStateFlow(emptyList())
//        viewModelScope.launch {
//            //list = repository.getCryptoOrders().flowOn(Dispatchers.IO)
//        }
//        return list
//    }
}
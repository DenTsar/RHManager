package com.example.rhmanager.presentation

import android.util.Log
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rhmanager.common.Resource
import com.example.rhmanager.data.remote.repository.RHRepositoryImpl
import com.example.rhmanager.data.remote.responses.HistoricalStockCrypto
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch


class TestViewModel : ViewModel(){
    val _testState = MutableStateFlow<UIState>(UIState.Empty)
    val testState : StateFlow<UIState> = _testState
    val repository  = RHRepositoryImpl()

    val data : MutableState<Resource<HistoricalStockCrypto>> = mutableStateOf(Resource.Loading())

    fun run(key : String){
        
    }
    
    sealed class UIState{
        object Success : UIState()
        object Error : UIState()
        object Loading : UIState()
        object Empty : UIState()
    }

    fun getCryptoData(): HistoricalStockCrypto?{
        var b : HistoricalStockCrypto? = null
        viewModelScope.launch {
            delay(5000)
            data.value = Resource.Success(repository.getHistoricalCryptoData("1ef78e1b-049b-4f12-90e5-555dcf2fe204","24_7","hour","3month"))
            delay(10000)
            data.value = Resource.Success(repository.getHistoricalCryptoData("1ef78e1b-049b-4f12-90e5-555dcf2fe204","24_7","hour","3month"))
            Log.d("qwery",data.value.data.toString())
            delay(5000)
            _testState.value = UIState.Success
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
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
            data.value = Resource.Success(repository.getCryptoData())
            Log.d("qwery",data.value.data.toString())
        }
        Log.d("qwery",data.value.data.toString())
        return b
    }

    fun getStuff(){
        var b : HistoricalData? = null
        viewModelScope.launch {
            val a = RHRepositoryImpl()
//            Log.d("qwer",client.attributes.toString())
            b = a.getCryptoData()//client.get<Page<Holding>>("/holdings")
            Log.d("qwert",b.toString())
//            val a = client.get<APIResult<CurrencyPair>>("https://nummus.robinhood.com/currency_pairs")
//            Log.d("Qwer",a.results[0].quote_currency.toString())
//            Log.d("Qwer",a.results[0].asset_currency.toString())
        }
    }
//    fun categoriesList(): Flow<CryptoOrder> {
//        var list: MutableStateFlow<Any> = MutableStateFlow(emptyList())
//        viewModelScope.launch {
//            //list = repository.getCryptoOrders().flowOn(Dispatchers.IO)
//        }
//        return list
//    }
}
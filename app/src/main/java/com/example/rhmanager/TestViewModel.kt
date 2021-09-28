package com.example.rhmanager

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rhmanager.data.remote.repository.RHRepositoryImpl
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch


class TestViewModel : ViewModel(){
    private val _testState = MutableStateFlow<UIState>(UIState.Empty)
    val testState : StateFlow<UIState> = _testState
    val repository  = RHRepositoryImpl()
    
    fun run(key : String){
        
    }
    
    sealed class UIState{
        object Success : UIState()
        object Error : UIState()
        object Loading : UIState()
        object Empty : UIState()
    }

    fun getStuff(){
        viewModelScope.launch {
            val a = RHRepositoryImpl()
//            Log.d("qwer",client.attributes.toString())
            val b = a.getCryptoOrders()//client.get<Page<Holding>>("/holdings")
            b.results.asFlow()
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
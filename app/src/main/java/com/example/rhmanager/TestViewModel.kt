package com.example.rhmanager

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import androidx.lifecycle.viewModelScope
import com.example.rhmanager.responses.Page
import com.example.rhmanager.responses.Holding
import io.ktor.client.request.*
import kotlinx.coroutines.launch


class TestViewModel : ViewModel(){
    private val _testState = MutableStateFlow<UIState>(UIState.Empty)
    val testState : StateFlow<UIState> = _testState
    
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
            Log.d("qwer",client.attributes.toString())
            val b = client.get<Page<Holding>>("/holdings")
            Log.d("qwert",b.toString())
//            val a = client.get<APIResult<CurrencyPair>>("https://nummus.robinhood.com/currency_pairs")
//            Log.d("Qwer",a.results[0].quote_currency.toString())
//            Log.d("Qwer",a.results[0].asset_currency.toString())

        }
    }
}
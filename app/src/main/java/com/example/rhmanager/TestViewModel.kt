package com.example.rhmanager

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

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
}
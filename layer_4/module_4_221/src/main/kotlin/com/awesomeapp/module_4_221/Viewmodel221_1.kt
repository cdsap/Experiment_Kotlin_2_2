package com.awesomeapp.module_4_221

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_3_152.Repository152_5
import com.awesomeapp.module_3_184.Repository184_5
import com.awesomeapp.module_3_168.Repository168_5
import com.awesomeapp.module_3_164.Repository164_5


@HiltViewModel
class Viewmodel221_1 @Inject constructor(
    private val repository0: Repository152_5,
    private val repository1: Repository184_5,
    private val repository2: Repository168_5,
    private val repository3: Repository164_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}
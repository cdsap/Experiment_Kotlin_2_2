package com.awesomeapp.module_4_214

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_3_140.Repository140_5
import com.awesomeapp.module_3_180.Repository180_5
import com.awesomeapp.module_3_156.Repository156_5
import com.awesomeapp.module_3_160.Repository160_5


@HiltViewModel
class Viewmodel214_1 @Inject constructor(
    private val repository0: Repository140_5,
    private val repository1: Repository180_5,
    private val repository2: Repository156_5,
    private val repository3: Repository160_5
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
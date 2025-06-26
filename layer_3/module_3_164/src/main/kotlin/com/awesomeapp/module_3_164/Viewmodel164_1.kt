package com.awesomeapp.module_3_164

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_2_120.Repository120_5
import com.awesomeapp.module_2_132.Repository132_5
import com.awesomeapp.module_2_128.Repository128_5
import com.awesomeapp.module_2_108.Repository108_5


@HiltViewModel
class Viewmodel164_1 @Inject constructor(
    private val repository0: Repository120_5,
    private val repository1: Repository132_5,
    private val repository2: Repository128_5,
    private val repository3: Repository108_5
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
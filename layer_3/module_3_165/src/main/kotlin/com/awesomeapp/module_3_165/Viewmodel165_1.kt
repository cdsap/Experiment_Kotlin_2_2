package com.awesomeapp.module_3_165

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_2_112.Repository112_5
import com.awesomeapp.module_2_100.Repository100_5
import com.awesomeapp.module_2_116.Repository116_5
import com.awesomeapp.module_2_120.Repository120_5


@HiltViewModel
class Viewmodel165_1 @Inject constructor(
    private val repository0: Repository112_5,
    private val repository1: Repository100_5,
    private val repository2: Repository116_5,
    private val repository3: Repository120_5
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
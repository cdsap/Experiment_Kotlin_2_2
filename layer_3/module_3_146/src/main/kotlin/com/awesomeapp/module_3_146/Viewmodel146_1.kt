package com.awesomeapp.module_3_146

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_2_128.Repository128_5
import com.awesomeapp.module_2_96.Repository96_5
import com.awesomeapp.module_2_116.Repository116_5
import com.awesomeapp.module_2_136.Repository136_5
import com.awesomeapp.module_2_104.Repository104_5


@HiltViewModel
class Viewmodel146_1 @Inject constructor(
    private val repository0: Repository128_5,
    private val repository1: Repository96_5,
    private val repository2: Repository116_5,
    private val repository3: Repository136_5,
    private val repository4: Repository104_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}
package com.awesomeapp.module_4_200

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_3_180.Repository180_5
import com.awesomeapp.module_3_168.Repository168_5
import com.awesomeapp.module_3_164.Repository164_5
import com.awesomeapp.module_3_176.Repository176_5
import com.awesomeapp.module_3_172.Repository172_5
import com.awesomeapp.module_3_184.Repository184_5
import com.awesomeapp.module_3_144.Repository144_5
import com.awesomeapp.module_3_140.Repository140_5
import com.awesomeapp.module_3_148.Repository148_5
import com.awesomeapp.module_3_156.Repository156_5
import com.awesomeapp.module_3_152.Repository152_5
import com.awesomeapp.module_3_160.Repository160_5


@HiltViewModel
class Viewmodel200_1 @Inject constructor(
    private val repository0: Repository180_5,
    private val repository1: Repository168_5,
    private val repository2: Repository164_5,
    private val repository3: Repository176_5,
    private val repository4: Repository172_5,
    private val repository5: Repository184_5,
    private val repository6: Repository144_5,
    private val repository7: Repository140_5,
    private val repository8: Repository148_5,
    private val repository9: Repository156_5,
    private val repository10: Repository152_5,
    private val repository11: Repository160_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData() + repository10.getData() + repository11.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}
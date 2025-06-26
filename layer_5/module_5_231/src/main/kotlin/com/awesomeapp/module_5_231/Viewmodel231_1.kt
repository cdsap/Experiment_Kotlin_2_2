package com.awesomeapp.module_5_231

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.module_4_188.Repository188_5
import com.awesomeapp.module_4_192.Repository192_5
import com.awesomeapp.module_4_196.Repository196_5
import com.awesomeapp.module_4_200.Repository200_5
import com.awesomeapp.module_4_204.Repository204_5
import com.awesomeapp.module_4_208.Repository208_5
import com.awesomeapp.module_4_212.Repository212_5
import com.awesomeapp.module_4_216.Repository216_5
import com.awesomeapp.module_4_220.Repository220_5
import com.awesomeapp.module_4_224.Repository224_5
import com.awesomeapp.module_4_228.Repository228_5


@HiltViewModel
class Viewmodel231_1 @Inject constructor(
    private val repository0: Repository188_5,
    private val repository1: Repository192_5,
    private val repository2: Repository196_5,
    private val repository3: Repository200_5,
    private val repository4: Repository204_5,
    private val repository5: Repository208_5,
    private val repository6: Repository212_5,
    private val repository7: Repository216_5,
    private val repository8: Repository220_5,
    private val repository9: Repository224_5,
    private val repository10: Repository228_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData() + repository10.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}
package com.awesomeapp.module_2_129

sealed class State129_16 {
    data object Loading : State129_16()
    data class Success(val data: String) : State129_16()
    data class Error(val message: String) : State129_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
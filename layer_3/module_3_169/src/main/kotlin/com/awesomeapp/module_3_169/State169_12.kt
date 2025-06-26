package com.awesomeapp.module_3_169

sealed class State169_12 {
    data object Loading : State169_12()
    data class Success(val data: String) : State169_12()
    data class Error(val message: String) : State169_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
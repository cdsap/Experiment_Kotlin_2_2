package com.awesomeapp.module_2_93

sealed class State93_16 {
    data object Loading : State93_16()
    data class Success(val data: String) : State93_16()
    data class Error(val message: String) : State93_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
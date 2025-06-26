package com.awesomeapp.module_3_179

sealed class State179_12 {
    data object Loading : State179_12()
    data class Success(val data: String) : State179_12()
    data class Error(val message: String) : State179_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
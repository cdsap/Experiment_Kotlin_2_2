package com.awesomeapp.module_4_223

sealed class State223_12 {
    data object Loading : State223_12()
    data class Success(val data: String) : State223_12()
    data class Error(val message: String) : State223_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_2_123

sealed class State123_19 {
    data object Loading : State123_19()
    data class Success(val data: String) : State123_19()
    data class Error(val message: String) : State123_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
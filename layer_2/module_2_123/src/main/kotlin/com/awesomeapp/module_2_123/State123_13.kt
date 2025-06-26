package com.awesomeapp.module_2_123

sealed class State123_13 {
    data object Loading : State123_13()
    data class Success(val data: String) : State123_13()
    data class Error(val message: String) : State123_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_2_123

sealed class State123_10 {
    data object Loading : State123_10()
    data class Success(val data: String) : State123_10()
    data class Error(val message: String) : State123_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
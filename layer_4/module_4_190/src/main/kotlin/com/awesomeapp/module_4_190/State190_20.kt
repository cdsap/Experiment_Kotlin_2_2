package com.awesomeapp.module_4_190

sealed class State190_20 {
    data object Loading : State190_20()
    data class Success(val data: String) : State190_20()
    data class Error(val message: String) : State190_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
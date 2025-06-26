package com.awesomeapp.module_4_223

sealed class State223_9 {
    data object Loading : State223_9()
    data class Success(val data: String) : State223_9()
    data class Error(val message: String) : State223_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
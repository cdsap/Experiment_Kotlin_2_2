package com.awesomeapp.module_4_206

sealed class State206_9 {
    data object Loading : State206_9()
    data class Success(val data: String) : State206_9()
    data class Error(val message: String) : State206_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
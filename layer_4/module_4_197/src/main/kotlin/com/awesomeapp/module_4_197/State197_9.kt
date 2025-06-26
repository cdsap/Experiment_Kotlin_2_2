package com.awesomeapp.module_4_197

sealed class State197_9 {
    data object Loading : State197_9()
    data class Success(val data: String) : State197_9()
    data class Error(val message: String) : State197_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
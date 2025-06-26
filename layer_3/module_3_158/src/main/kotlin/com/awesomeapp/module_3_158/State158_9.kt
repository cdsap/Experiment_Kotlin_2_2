package com.awesomeapp.module_3_158

sealed class State158_9 {
    data object Loading : State158_9()
    data class Success(val data: String) : State158_9()
    data class Error(val message: String) : State158_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
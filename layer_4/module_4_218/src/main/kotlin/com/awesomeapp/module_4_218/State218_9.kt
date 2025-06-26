package com.awesomeapp.module_4_218

sealed class State218_9 {
    data object Loading : State218_9()
    data class Success(val data: String) : State218_9()
    data class Error(val message: String) : State218_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
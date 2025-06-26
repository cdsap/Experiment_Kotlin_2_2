package com.awesomeapp.module_3_179

sealed class State179_9 {
    data object Loading : State179_9()
    data class Success(val data: String) : State179_9()
    data class Error(val message: String) : State179_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_4_199

sealed class State199_9 {
    data object Loading : State199_9()
    data class Success(val data: String) : State199_9()
    data class Error(val message: String) : State199_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
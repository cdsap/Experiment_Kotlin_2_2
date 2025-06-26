package com.awesomeapp.module_3_181

sealed class State181_9 {
    data object Loading : State181_9()
    data class Success(val data: String) : State181_9()
    data class Error(val message: String) : State181_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
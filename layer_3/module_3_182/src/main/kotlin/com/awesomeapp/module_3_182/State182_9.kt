package com.awesomeapp.module_3_182

sealed class State182_9 {
    data object Loading : State182_9()
    data class Success(val data: String) : State182_9()
    data class Error(val message: String) : State182_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
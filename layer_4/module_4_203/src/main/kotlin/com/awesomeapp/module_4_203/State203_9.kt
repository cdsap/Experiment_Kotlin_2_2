package com.awesomeapp.module_4_203

sealed class State203_9 {
    data object Loading : State203_9()
    data class Success(val data: String) : State203_9()
    data class Error(val message: String) : State203_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
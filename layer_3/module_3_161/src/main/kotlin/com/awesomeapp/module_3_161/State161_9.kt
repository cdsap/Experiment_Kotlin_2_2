package com.awesomeapp.module_3_161

sealed class State161_9 {
    data object Loading : State161_9()
    data class Success(val data: String) : State161_9()
    data class Error(val message: String) : State161_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_2_134

sealed class State134_9 {
    data object Loading : State134_9()
    data class Success(val data: String) : State134_9()
    data class Error(val message: String) : State134_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
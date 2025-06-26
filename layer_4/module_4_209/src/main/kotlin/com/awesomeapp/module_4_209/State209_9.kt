package com.awesomeapp.module_4_209

sealed class State209_9 {
    data object Loading : State209_9()
    data class Success(val data: String) : State209_9()
    data class Error(val message: String) : State209_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
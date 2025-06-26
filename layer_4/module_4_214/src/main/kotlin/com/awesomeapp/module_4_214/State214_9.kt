package com.awesomeapp.module_4_214

sealed class State214_9 {
    data object Loading : State214_9()
    data class Success(val data: String) : State214_9()
    data class Error(val message: String) : State214_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
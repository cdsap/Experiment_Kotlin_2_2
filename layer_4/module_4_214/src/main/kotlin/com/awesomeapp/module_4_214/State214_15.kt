package com.awesomeapp.module_4_214

sealed class State214_15 {
    data object Loading : State214_15()
    data class Success(val data: String) : State214_15()
    data class Error(val message: String) : State214_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
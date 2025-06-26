package com.awesomeapp.module_4_212

sealed class State212_14 {
    data object Loading : State212_14()
    data class Success(val data: String) : State212_14()
    data class Error(val message: String) : State212_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
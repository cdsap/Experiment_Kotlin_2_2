package com.awesomeapp.module_3_164

sealed class State164_14 {
    data object Loading : State164_14()
    data class Success(val data: String) : State164_14()
    data class Error(val message: String) : State164_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_3_164

sealed class State164_20 {
    data object Loading : State164_20()
    data class Success(val data: String) : State164_20()
    data class Error(val message: String) : State164_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
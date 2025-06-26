package com.awesomeapp.module_4_219

sealed class State219_19 {
    data object Loading : State219_19()
    data class Success(val data: String) : State219_19()
    data class Error(val message: String) : State219_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
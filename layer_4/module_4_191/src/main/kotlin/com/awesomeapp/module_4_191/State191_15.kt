package com.awesomeapp.module_4_191

sealed class State191_15 {
    data object Loading : State191_15()
    data class Success(val data: String) : State191_15()
    data class Error(val message: String) : State191_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
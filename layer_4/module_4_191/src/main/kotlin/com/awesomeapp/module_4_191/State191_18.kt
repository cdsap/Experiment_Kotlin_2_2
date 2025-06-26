package com.awesomeapp.module_4_191

sealed class State191_18 {
    data object Loading : State191_18()
    data class Success(val data: String) : State191_18()
    data class Error(val message: String) : State191_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
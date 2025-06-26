package com.awesomeapp.module_1_75

sealed class State75_12 {
    data object Loading : State75_12()
    data class Success(val data: String) : State75_12()
    data class Error(val message: String) : State75_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_2_98

sealed class State98_15 {
    data object Loading : State98_15()
    data class Success(val data: String) : State98_15()
    data class Error(val message: String) : State98_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
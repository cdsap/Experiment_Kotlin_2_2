package com.awesomeapp.module_1_62

sealed class State62_15 {
    data object Loading : State62_15()
    data class Success(val data: String) : State62_15()
    data class Error(val message: String) : State62_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
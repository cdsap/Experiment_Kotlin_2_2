package com.awesomeapp.module_1_60

sealed class State60_17 {
    data object Loading : State60_17()
    data class Success(val data: String) : State60_17()
    data class Error(val message: String) : State60_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_2_131

sealed class State131_15 {
    data object Loading : State131_15()
    data class Success(val data: String) : State131_15()
    data class Error(val message: String) : State131_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_4_187

sealed class State187_15 {
    data object Loading : State187_15()
    data class Success(val data: String) : State187_15()
    data class Error(val message: String) : State187_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_4_187

sealed class State187_18 {
    data object Loading : State187_18()
    data class Success(val data: String) : State187_18()
    data class Error(val message: String) : State187_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
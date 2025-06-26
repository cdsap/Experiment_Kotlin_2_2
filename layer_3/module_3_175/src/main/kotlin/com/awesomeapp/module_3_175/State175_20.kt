package com.awesomeapp.module_3_175

sealed class State175_20 {
    data object Loading : State175_20()
    data class Success(val data: String) : State175_20()
    data class Error(val message: String) : State175_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
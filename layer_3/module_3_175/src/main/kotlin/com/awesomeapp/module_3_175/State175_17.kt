package com.awesomeapp.module_3_175

sealed class State175_17 {
    data object Loading : State175_17()
    data class Success(val data: String) : State175_17()
    data class Error(val message: String) : State175_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
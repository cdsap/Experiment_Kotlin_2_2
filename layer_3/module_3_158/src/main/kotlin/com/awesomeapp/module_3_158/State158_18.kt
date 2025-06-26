package com.awesomeapp.module_3_158

sealed class State158_18 {
    data object Loading : State158_18()
    data class Success(val data: String) : State158_18()
    data class Error(val message: String) : State158_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
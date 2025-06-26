package com.awesomeapp.module_3_163

sealed class State163_18 {
    data object Loading : State163_18()
    data class Success(val data: String) : State163_18()
    data class Error(val message: String) : State163_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
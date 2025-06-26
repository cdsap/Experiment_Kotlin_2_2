package com.awesomeapp.module_3_143

sealed class State143_18 {
    data object Loading : State143_18()
    data class Success(val data: String) : State143_18()
    data class Error(val message: String) : State143_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_3_150

sealed class State150_15 {
    data object Loading : State150_15()
    data class Success(val data: String) : State150_15()
    data class Error(val message: String) : State150_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
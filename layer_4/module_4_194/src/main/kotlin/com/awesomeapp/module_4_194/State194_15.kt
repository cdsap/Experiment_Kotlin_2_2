package com.awesomeapp.module_4_194

sealed class State194_15 {
    data object Loading : State194_15()
    data class Success(val data: String) : State194_15()
    data class Error(val message: String) : State194_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
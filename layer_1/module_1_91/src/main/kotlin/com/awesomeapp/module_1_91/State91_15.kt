package com.awesomeapp.module_1_91

sealed class State91_15 {
    data object Loading : State91_15()
    data class Success(val data: String) : State91_15()
    data class Error(val message: String) : State91_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
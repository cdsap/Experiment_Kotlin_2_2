package com.awesomeapp.module_3_177

sealed class State177_13 {
    data object Loading : State177_13()
    data class Success(val data: String) : State177_13()
    data class Error(val message: String) : State177_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_4_208

sealed class State208_14 {
    data object Loading : State208_14()
    data class Success(val data: String) : State208_14()
    data class Error(val message: String) : State208_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
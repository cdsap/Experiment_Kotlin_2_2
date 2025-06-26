package com.awesomeapp.module_3_165

sealed class State165_12 {
    data object Loading : State165_12()
    data class Success(val data: String) : State165_12()
    data class Error(val message: String) : State165_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
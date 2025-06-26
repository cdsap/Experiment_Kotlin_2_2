package com.awesomeapp.module_2_134

sealed class State134_12 {
    data object Loading : State134_12()
    data class Success(val data: String) : State134_12()
    data class Error(val message: String) : State134_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
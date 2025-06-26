package com.awesomeapp.module_2_112

sealed class State112_17 {
    data object Loading : State112_17()
    data class Success(val data: String) : State112_17()
    data class Error(val message: String) : State112_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
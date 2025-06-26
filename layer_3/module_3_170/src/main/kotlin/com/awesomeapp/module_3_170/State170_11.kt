package com.awesomeapp.module_3_170

sealed class State170_11 {
    data object Loading : State170_11()
    data class Success(val data: String) : State170_11()
    data class Error(val message: String) : State170_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_3_170

sealed class State170_14 {
    data object Loading : State170_14()
    data class Success(val data: String) : State170_14()
    data class Error(val message: String) : State170_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
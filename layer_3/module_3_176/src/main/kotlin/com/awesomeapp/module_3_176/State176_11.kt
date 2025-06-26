package com.awesomeapp.module_3_176

sealed class State176_11 {
    data object Loading : State176_11()
    data class Success(val data: String) : State176_11()
    data class Error(val message: String) : State176_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
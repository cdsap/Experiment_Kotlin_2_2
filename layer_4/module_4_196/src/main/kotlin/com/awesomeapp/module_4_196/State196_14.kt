package com.awesomeapp.module_4_196

sealed class State196_14 {
    data object Loading : State196_14()
    data class Success(val data: String) : State196_14()
    data class Error(val message: String) : State196_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
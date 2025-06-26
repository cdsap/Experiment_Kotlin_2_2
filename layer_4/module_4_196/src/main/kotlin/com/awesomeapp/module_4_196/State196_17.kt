package com.awesomeapp.module_4_196

sealed class State196_17 {
    data object Loading : State196_17()
    data class Success(val data: String) : State196_17()
    data class Error(val message: String) : State196_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
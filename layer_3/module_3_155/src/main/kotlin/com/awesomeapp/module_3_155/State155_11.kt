package com.awesomeapp.module_3_155

sealed class State155_11 {
    data object Loading : State155_11()
    data class Success(val data: String) : State155_11()
    data class Error(val message: String) : State155_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
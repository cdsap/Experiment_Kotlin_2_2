package com.awesomeapp.module_4_207

sealed class State207_16 {
    data object Loading : State207_16()
    data class Success(val data: String) : State207_16()
    data class Error(val message: String) : State207_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
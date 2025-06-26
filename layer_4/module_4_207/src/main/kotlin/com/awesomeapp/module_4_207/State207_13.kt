package com.awesomeapp.module_4_207

sealed class State207_13 {
    data object Loading : State207_13()
    data class Success(val data: String) : State207_13()
    data class Error(val message: String) : State207_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
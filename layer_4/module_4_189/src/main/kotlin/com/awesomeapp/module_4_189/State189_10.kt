package com.awesomeapp.module_4_189

sealed class State189_10 {
    data object Loading : State189_10()
    data class Success(val data: String) : State189_10()
    data class Error(val message: String) : State189_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
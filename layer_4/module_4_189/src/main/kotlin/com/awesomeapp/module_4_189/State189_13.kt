package com.awesomeapp.module_4_189

sealed class State189_13 {
    data object Loading : State189_13()
    data class Success(val data: String) : State189_13()
    data class Error(val message: String) : State189_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
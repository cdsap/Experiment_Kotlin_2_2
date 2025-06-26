package com.awesomeapp.module_4_189

sealed class State189_19 {
    data object Loading : State189_19()
    data class Success(val data: String) : State189_19()
    data class Error(val message: String) : State189_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
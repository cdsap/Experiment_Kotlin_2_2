package com.awesomeapp.module_2_119

sealed class State119_18 {
    data object Loading : State119_18()
    data class Success(val data: String) : State119_18()
    data class Error(val message: String) : State119_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
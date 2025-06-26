package com.awesomeapp.module_4_193

sealed class State193_12 {
    data object Loading : State193_12()
    data class Success(val data: String) : State193_12()
    data class Error(val message: String) : State193_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
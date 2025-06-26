package com.awesomeapp.module_4_226

sealed class State226_12 {
    data object Loading : State226_12()
    data class Success(val data: String) : State226_12()
    data class Error(val message: String) : State226_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
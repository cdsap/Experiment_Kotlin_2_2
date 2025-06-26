package com.awesomeapp.module_4_204

sealed class State204_12 {
    data object Loading : State204_12()
    data class Success(val data: String) : State204_12()
    data class Error(val message: String) : State204_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
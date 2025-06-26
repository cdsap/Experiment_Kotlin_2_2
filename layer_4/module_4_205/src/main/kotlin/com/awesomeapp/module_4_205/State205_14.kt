package com.awesomeapp.module_4_205

sealed class State205_14 {
    data object Loading : State205_14()
    data class Success(val data: String) : State205_14()
    data class Error(val message: String) : State205_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_4_205

sealed class State205_11 {
    data object Loading : State205_11()
    data class Success(val data: String) : State205_11()
    data class Error(val message: String) : State205_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
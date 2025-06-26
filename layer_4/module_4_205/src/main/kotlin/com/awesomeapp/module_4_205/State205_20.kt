package com.awesomeapp.module_4_205

sealed class State205_20 {
    data object Loading : State205_20()
    data class Success(val data: String) : State205_20()
    data class Error(val message: String) : State205_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
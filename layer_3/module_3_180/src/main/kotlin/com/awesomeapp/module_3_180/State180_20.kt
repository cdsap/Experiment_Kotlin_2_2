package com.awesomeapp.module_3_180

sealed class State180_20 {
    data object Loading : State180_20()
    data class Success(val data: String) : State180_20()
    data class Error(val message: String) : State180_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
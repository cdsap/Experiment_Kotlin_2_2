package com.awesomeapp.module_3_152

sealed class State152_11 {
    data object Loading : State152_11()
    data class Success(val data: String) : State152_11()
    data class Error(val message: String) : State152_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
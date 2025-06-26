package com.awesomeapp.module_3_152

sealed class State152_20 {
    data object Loading : State152_20()
    data class Success(val data: String) : State152_20()
    data class Error(val message: String) : State152_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
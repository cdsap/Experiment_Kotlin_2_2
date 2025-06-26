package com.awesomeapp.module_3_152

sealed class State152_17 {
    data object Loading : State152_17()
    data class Success(val data: String) : State152_17()
    data class Error(val message: String) : State152_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
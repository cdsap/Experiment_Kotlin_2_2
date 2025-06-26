package com.awesomeapp.module_3_141

sealed class State141_19 {
    data object Loading : State141_19()
    data class Success(val data: String) : State141_19()
    data class Error(val message: String) : State141_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_3_140

sealed class State140_13 {
    data object Loading : State140_13()
    data class Success(val data: String) : State140_13()
    data class Error(val message: String) : State140_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
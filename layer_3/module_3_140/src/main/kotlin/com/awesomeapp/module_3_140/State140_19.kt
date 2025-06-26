package com.awesomeapp.module_3_140

sealed class State140_19 {
    data object Loading : State140_19()
    data class Success(val data: String) : State140_19()
    data class Error(val message: String) : State140_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
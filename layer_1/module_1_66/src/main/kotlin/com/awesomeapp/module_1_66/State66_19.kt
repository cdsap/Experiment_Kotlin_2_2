package com.awesomeapp.module_1_66

sealed class State66_19 {
    data object Loading : State66_19()
    data class Success(val data: String) : State66_19()
    data class Error(val message: String) : State66_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
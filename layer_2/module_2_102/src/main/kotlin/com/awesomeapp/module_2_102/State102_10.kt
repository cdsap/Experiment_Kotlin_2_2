package com.awesomeapp.module_2_102

sealed class State102_10 {
    data object Loading : State102_10()
    data class Success(val data: String) : State102_10()
    data class Error(val message: String) : State102_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
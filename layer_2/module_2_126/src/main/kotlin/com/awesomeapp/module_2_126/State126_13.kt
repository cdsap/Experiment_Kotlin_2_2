package com.awesomeapp.module_2_126

sealed class State126_13 {
    data object Loading : State126_13()
    data class Success(val data: String) : State126_13()
    data class Error(val message: String) : State126_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
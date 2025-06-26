package com.awesomeapp.module_1_65

sealed class State65_20 {
    data object Loading : State65_20()
    data class Success(val data: String) : State65_20()
    data class Error(val message: String) : State65_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
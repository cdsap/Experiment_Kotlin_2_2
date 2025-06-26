package com.awesomeapp.module_2_124

sealed class State124_20 {
    data object Loading : State124_20()
    data class Success(val data: String) : State124_20()
    data class Error(val message: String) : State124_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
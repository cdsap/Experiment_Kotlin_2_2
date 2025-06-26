package com.awesomeapp.module_2_124

sealed class State124_11 {
    data object Loading : State124_11()
    data class Success(val data: String) : State124_11()
    data class Error(val message: String) : State124_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
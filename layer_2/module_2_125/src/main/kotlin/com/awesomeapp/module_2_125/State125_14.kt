package com.awesomeapp.module_2_125

sealed class State125_14 {
    data object Loading : State125_14()
    data class Success(val data: String) : State125_14()
    data class Error(val message: String) : State125_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
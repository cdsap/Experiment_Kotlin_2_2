package com.awesomeapp.module_2_110

sealed class State110_11 {
    data object Loading : State110_11()
    data class Success(val data: String) : State110_11()
    data class Error(val message: String) : State110_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
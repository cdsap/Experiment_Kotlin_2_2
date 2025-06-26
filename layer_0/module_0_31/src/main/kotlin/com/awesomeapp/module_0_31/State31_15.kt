package com.awesomeapp.module_0_31

sealed class State31_15 {
    data object Loading : State31_15()
    data class Success(val data: String) : State31_15()
    data class Error(val message: String) : State31_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
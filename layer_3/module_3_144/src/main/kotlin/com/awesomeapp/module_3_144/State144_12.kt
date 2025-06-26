package com.awesomeapp.module_3_144

sealed class State144_12 {
    data object Loading : State144_12()
    data class Success(val data: String) : State144_12()
    data class Error(val message: String) : State144_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
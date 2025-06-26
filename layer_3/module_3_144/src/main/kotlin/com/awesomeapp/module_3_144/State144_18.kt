package com.awesomeapp.module_3_144

sealed class State144_18 {
    data object Loading : State144_18()
    data class Success(val data: String) : State144_18()
    data class Error(val message: String) : State144_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
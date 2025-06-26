package com.awesomeapp.module_4_230

sealed class State230_14 {
    data object Loading : State230_14()
    data class Success(val data: String) : State230_14()
    data class Error(val message: String) : State230_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
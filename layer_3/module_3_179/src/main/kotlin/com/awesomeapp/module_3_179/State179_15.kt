package com.awesomeapp.module_3_179

sealed class State179_15 {
    data object Loading : State179_15()
    data class Success(val data: String) : State179_15()
    data class Error(val message: String) : State179_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
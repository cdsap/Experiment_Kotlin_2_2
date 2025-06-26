package com.awesomeapp.module_4_192

sealed class State192_15 {
    data object Loading : State192_15()
    data class Success(val data: String) : State192_15()
    data class Error(val message: String) : State192_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_4_203

sealed class State203_15 {
    data object Loading : State203_15()
    data class Success(val data: String) : State203_15()
    data class Error(val message: String) : State203_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
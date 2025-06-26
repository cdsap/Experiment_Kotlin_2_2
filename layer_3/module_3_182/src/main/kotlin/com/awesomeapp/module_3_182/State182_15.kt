package com.awesomeapp.module_3_182

sealed class State182_15 {
    data object Loading : State182_15()
    data class Success(val data: String) : State182_15()
    data class Error(val message: String) : State182_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
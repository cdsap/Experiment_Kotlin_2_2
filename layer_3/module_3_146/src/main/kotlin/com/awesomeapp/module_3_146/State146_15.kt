package com.awesomeapp.module_3_146

sealed class State146_15 {
    data object Loading : State146_15()
    data class Success(val data: String) : State146_15()
    data class Error(val message: String) : State146_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_2_121

sealed class State121_15 {
    data object Loading : State121_15()
    data class Success(val data: String) : State121_15()
    data class Error(val message: String) : State121_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
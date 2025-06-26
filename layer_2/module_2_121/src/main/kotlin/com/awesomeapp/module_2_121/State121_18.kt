package com.awesomeapp.module_2_121

sealed class State121_18 {
    data object Loading : State121_18()
    data class Success(val data: String) : State121_18()
    data class Error(val message: String) : State121_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
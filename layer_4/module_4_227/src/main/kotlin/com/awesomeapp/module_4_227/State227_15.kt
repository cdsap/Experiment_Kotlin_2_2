package com.awesomeapp.module_4_227

sealed class State227_15 {
    data object Loading : State227_15()
    data class Success(val data: String) : State227_15()
    data class Error(val message: String) : State227_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
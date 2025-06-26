package com.awesomeapp.module_4_227

sealed class State227_18 {
    data object Loading : State227_18()
    data class Success(val data: String) : State227_18()
    data class Error(val message: String) : State227_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
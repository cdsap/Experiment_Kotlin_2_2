package com.awesomeapp.module_3_183

sealed class State183_16 {
    data object Loading : State183_16()
    data class Success(val data: String) : State183_16()
    data class Error(val message: String) : State183_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_5_231

sealed class State231_16 {
    data object Loading : State231_16()
    data class Success(val data: String) : State231_16()
    data class Error(val message: String) : State231_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
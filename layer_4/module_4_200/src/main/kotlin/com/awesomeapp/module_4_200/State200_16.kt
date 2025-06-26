package com.awesomeapp.module_4_200

sealed class State200_16 {
    data object Loading : State200_16()
    data class Success(val data: String) : State200_16()
    data class Error(val message: String) : State200_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
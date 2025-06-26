package com.awesomeapp.module_2_128

sealed class State128_20 {
    data object Loading : State128_20()
    data class Success(val data: String) : State128_20()
    data class Error(val message: String) : State128_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.module_3_160

sealed class State160_16 {
    data object Loading : State160_16()
    data class Success(val data: String) : State160_16()
    data class Error(val message: String) : State160_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
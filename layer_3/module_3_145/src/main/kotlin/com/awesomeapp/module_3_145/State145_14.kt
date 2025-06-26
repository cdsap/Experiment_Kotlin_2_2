package com.awesomeapp.module_3_145

sealed class State145_14 {
    data object Loading : State145_14()
    data class Success(val data: String) : State145_14()
    data class Error(val message: String) : State145_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
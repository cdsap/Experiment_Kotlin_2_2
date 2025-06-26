package com.awesomeapp.module_0_46

sealed class State46_12 {
    data object Loading : State46_12()
    data class Success(val data: String) : State46_12()
    data class Error(val message: String) : State46_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
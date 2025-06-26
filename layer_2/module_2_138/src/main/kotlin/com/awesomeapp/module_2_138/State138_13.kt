package com.awesomeapp.module_2_138

sealed class State138_13 {
    data object Loading : State138_13()
    data class Success(val data: String) : State138_13()
    data class Error(val message: String) : State138_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}